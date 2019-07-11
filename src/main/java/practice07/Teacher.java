package practice07;

public class Teacher extends Person{
    private Klass number;

    public Teacher(String name, int age, Klass number) {
        super(name, age);
        this.number = number;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getNumber() {
        return number;
    }

    public void setNumber(Klass number) {
        this.number = number;
    }

    @Override
    public String introduce() {
        if(this.number == null){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach "+this.number.getDisplayName()+".";
    }
}
