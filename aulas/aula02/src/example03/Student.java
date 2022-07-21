package example03;

public class Student extends Person{
    private String course;

    public Student(String name, String course){
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override // sobrescreve o comportamento do toString na mãe de todas as classes (Object)
    public String toString(){
        return super.toString() + ", " + course;
    }
}
