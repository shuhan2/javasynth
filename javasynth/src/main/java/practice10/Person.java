package practice10;

public class Person {
    public void setName(String name) {
        this.name = name;
    }

    public  String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int id;
    public Person(int id,String name,int age){
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

    @Override
    public String toString() {
        return introduce();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString())&&this.hashCode()==obj.hashCode();
    }
}
