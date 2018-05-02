package practice06;

public class Teacher extends Person{
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int klass;
    public Teacher(String name,int age,int klass){
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public String introduce(){
        Person person = new Person(name,age);
        String result = "";
        if (klass==0) {

            result = person.introduce() + " I am a Teacher. I teach No Class." ;
        }
        else {
            result = person.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        }
        return  result;
    }
}
