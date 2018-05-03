package practice11;

import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teacher extends Person implements Observer {
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass klass;

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(HashSet<Klass> classes) {
        this.classes = classes;
    }

    public Set<Klass> classes = new TreeSet<>();
    public Teacher(int id,String name,int age){
        super(id,name,age);

    }
    public Teacher(int id,String name,int age,HashSet<Klass> classes){
        super(id,name,age);
        this.classes = classes;

        for(Klass klass : this.classes){
            klass.addTeachers(this);
        }
    }

    @Override
    public String introduce(){
        Person person = new Person(id,name,age);
        String result ;
        if (this.classes==null||this.classes.size()==0) {
            result = person.introduce() + " I am a Teacher. I teach No Class." ;
        }
        else {
            result = person.introduce() + " I am a Teacher. I teach Class " ;

            for(Klass klass : classes){
                result = result+ klass.number+", ";
            }
            result= result.substring(0,result.length()-2);
            result+=".";
        }
        return  result;
    }
    public String introduceWith(Student student){
        String res = "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher.";
        if (  this.classes.contains(student.klass)){
            res = res+" I teach "+student.name+".";
        }
        else {
            res = res+" I don't teach "+student.name+".";
        }
        return res;
    }
    public boolean isTeaching(Student student){
        return classes.contains(student.klass);
    }

    @Override
    public void know_Leader(Student student) {
        System.out.print("I am "+this.name+". I know "+student.name+" become Leader of Class "+this.klass.number+".\n");
    }

    @Override
    public void know_Student(Student student) {
        System.out.print("I am "+this.name+". I know "+student.name+" has joined Class "+this.klass.number+".\n");
    }

}
