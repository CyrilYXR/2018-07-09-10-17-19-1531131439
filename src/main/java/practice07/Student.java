package practice07;

public class Student extends Person{
    private Klass number;

    public Klass getNumber() {
        return number;
    }

    public void setNumber(Klass number) {
        this.number = number;
    }

    public Student(String name, int age, Klass number) {
        super(name, age);
        this.number = number;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at "+this.number.getDisplayName()+".";
    }
}
