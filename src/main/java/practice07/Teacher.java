package practice07;

public class Teacher extends Person{
    private Klass number;

    public Teacher(String name, int age, Klass number) {
        super(name, age);
        this.number = number;
    }

    public Klass getNumber() {
        return number;
    }

    public void setNumber(Klass number) {
        this.number = number;
    }
}
