package example03;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override // sobrescreve o comportamento do toString na mãe de todas as classes (Object)
    public String toString(){
        return name;
    }
}
