package practice11;

import java.util.Iterator;
import java.util.Set;

public class Teacher extends Person{
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

    public void setClasses(Set<Klass> classes) {
        this.classes = classes;
    }

    public Set<Klass> classes;
    public Teacher(int id,String name,int age,Set<Klass> classes){
        super(id,name,age);
        this.classes = classes;
        for(Klass klass : classes){
            klass.setTeacher(this);
        }
    }
    public Teacher(int id,String name,int age){
        super(id,name,age);

    }
    public String introduce(){
        Person person = new Person(id,name,age);
        String result ;
        if (this.classes==null||this.classes.size()==0) {
            result = person.introduce() + " I am a Teacher. I teach No Class." ;
        }
        else {
            result = person.introduce() + " I am a Teacher. I teach Class " ;
            Iterator<Klass> it = this.classes.iterator();
            while (it.hasNext()){
                result = result+ it.next().number+", ";
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


}
