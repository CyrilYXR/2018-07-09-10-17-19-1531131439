package practice09;

public class Student extends Person {
    private Klass number;

    public Klass getNumber() {
        return number;
    }

    public void setNumber(Klass number) {
        this.number = number;
    }

    public Student(int id, String name, int age, Klass number) {
        super(id, name, age);
        this.number = number;
    }

    @Override
    public String introduce() {
        if(this.number.getLeader()!=null && this.number.getLeader().getName().equals(this.getName())){
            return super.introduce()+" I am a Student. I am Leader of "+number.getDisplayName()+".";
        }
        return super.introduce()+" I am a Student. I am at "+this.number.getDisplayName()+".";
    }
}
