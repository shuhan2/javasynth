package practice02;

public class Student extends Person{
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

   public int klass;
    public Student(String name,int age,int klass){
        super(name,age);
        this.klass=klass;
    }
    public String introduce(){
        String result = "I am a Student. "+"I am at Class "+this.klass+".";
        return  result;
    }
}
