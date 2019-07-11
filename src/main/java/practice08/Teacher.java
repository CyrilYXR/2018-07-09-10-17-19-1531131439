package practice08;

public class Teacher extends Person{
    private Klass number;

    public Teacher(int id, String name, int age, Klass number) {
        super(id, name, age);
        this.number = number;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
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

    public String introduceWith(Student student){
        if(student.getNumber().getNumber() == this.number.getNumber()){
            return super.introduce() +  " I am a Teacher. I teach "+student.getName()+".";
        } else {
            return super.introduce() +  " I am a Teacher. I don't teach "+student.getName()+".";
        }
    }
}

