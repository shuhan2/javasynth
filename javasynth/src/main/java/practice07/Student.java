package practice07;

public class Student extends Person {
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;
    public Student(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }
    public String introduce(){
        Person person = new Person(name,age);
        String result = person.introduce()+" I am a Student. "+"I am at Class "+this.klass.number+".";
        return  result;
    }
}
