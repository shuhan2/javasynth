package practice10;

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
    public Klass(int num){
        this.number = num;

    }
    ArrayList<Student> member = new ArrayList<Student>();
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        if (member.contains(student)) {
            leader = student;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember (Student student){
        member.add(student);
    }
}
