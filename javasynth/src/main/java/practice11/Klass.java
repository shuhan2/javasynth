package practice11;



import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Klass implements Comparable<Klass>, Observed{
    private LinkedHashSet<Observer> teachers = new LinkedHashSet<>();
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int number;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student leader;
    public Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass(int num){
        this.number = num;

    }
    ArrayList<Student> member = new ArrayList<>();
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        if (member.contains(student)) {
            leader = student;
            if(this.getTeacher()!=null) {
//                String result = "I am " + this.getTeacher().getName() + ". I know " + leader.getName() + " become Leader of Class " + this.getNumber() + ".\n";
//                System.out.print(result);

                inform_Leader(leader);
            }

        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember (Student student){
        member.add(student);
        if(this.getTeacher()!=null) {
            inform_Student(student);
        }
    }
    public void addTeachers(Observer observer){
        teachers.add(observer);
    }

    @Override
    public int compareTo(Klass o) {
        return 0;
    }

    @Override
    public void inform_Leader(Student student) {
        for (Observer teacher : teachers) {
            teacher.know_Leader(student);
        }
    }

    @Override
    public void inform_Student(Student student) {
        for (Observer teacher : teachers) {
            teacher.know_Student(student);
        }
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
