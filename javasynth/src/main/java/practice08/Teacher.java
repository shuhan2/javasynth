package practice08;

public class Teacher extends Person{
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;
    public Teacher(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass = klass;
    }
    public Teacher(int id,String name,int age){
        super(id,name,age);

    }
    public String introduce(){
        Person person = new Person(id,name,age);
        String result ;
        if (this.klass==null) {
            result = person.introduce() + " I am a Teacher. I teach No Class." ;
        }
        else {
            result = person.introduce() + " I am a Teacher. I teach Class " + this.klass.number + ".";
        }
        return  result;
    }
    public String introduceWith(Student student){
        String res = "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher.";
        if (student.klass == this.klass){
            res = res+" I teach "+student.name+".";
        }
        else {
            res = res+" I don't teach "+student.name+".";
        }
        return res;
    }
}
