package practice01;

public class Person {
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private  String name;
    private Integer age;
    public Person(String name,int age){
         this.name = name;
         this.age = age;
    }
    public String getName(){
        return this.name;
     }
    public int getAge(){
        return this.age;
    }
    public String introduce(){
         String result = "My name is "+this.name+"."+" I am "+this.age+" years old.";
         return  result;
    }
}
