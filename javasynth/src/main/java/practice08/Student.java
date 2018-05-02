package practice08;

public class Student extends  Person{
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;
    public Student(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass=klass;
    }
    public String introduce(){
        Person person = new Person(id,name,age);
        String result;
        if (this.klass.getLeader()!=null&&this.klass.getLeader().name.equals(person.name)) {
             result = person.introduce() + " I am a Student. " + "I am Leader of Class " + this.klass.number + ".";
        }
        else{
            result = person.introduce()+" I am a Student. "+"I am at Class "+this.klass.number+".";
        }
        return  result;
    }


}
