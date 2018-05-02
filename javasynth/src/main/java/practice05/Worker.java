package practice05;

public class Worker extends Person{
    public Worker(String name,int age){
        super(name,age);

    }
    public String introduce(){
        Person person = new Person(name,age);
        String result = person.introduce()+" I am a Worker. I have a job.";
        return  result;
    }
}
