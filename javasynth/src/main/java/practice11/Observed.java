package practice11;
//被观察者
public interface Observed {
    void inform_Leader(Student student);
    void inform_Student(Student student);
    void addTeacher(Teacher teacher);

}
