package practice07;

public class Klass {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int number;
    public Klass(int num){
        this.number = num;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }

}
