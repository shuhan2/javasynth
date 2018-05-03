package practice11;



import java.util.ArrayList;

public class Klass {
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
                String result = "I am " + this.getTeacher().getName() + ". I know " + leader.getName() + " become Leader of Class " + this.getNumber() + ".\n";
                System.out.print(result);
            }
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember (Student student){
        member.add(student);
        if(this.getTeacher()!=null) {
            String result = "I am " + this.getTeacher().getName() + ". I know " + student.getName() + " has joined Class " + this.getNumber() + ".\n";
            System.out.print(result);
        }
    }
}
