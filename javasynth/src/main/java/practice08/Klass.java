package practice08;

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
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
       leader = student;
    }

}
