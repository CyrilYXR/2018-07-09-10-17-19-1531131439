package practice11;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person {
    private Klass number;
    private List<Klass> classes = new LinkedList<>();

    public List getClasses() {
        return classes;
    }

    public void setClasses(LinkedList classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = null;
    }

    public Teacher(int id, String name, int age, Klass number) {
        super(id, name, age);
        this.number = number;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.classes = linkedList;
    }

    public Klass getNumber() {
        return number;
    }

    public void setNumber(Klass number) {
        this.number = number;
    }

    @Override
    public String introduce() {
        if(classes==null || classes.size()<1){
            return super.introduce()+" I am a Teacher. I teach No Class.";
        } else {
            String classNumbers = "";
            for(int i=0;i<classes.size();i++){
                classNumbers+=classes.get(i).getNumber();
                if(i != classes.size()-1){
                    classNumbers+=", ";
                }
            }
            return super.introduce()+" I am a Teacher. I teach Class "+classNumbers+".";
        }

    }

    public String introduceWith(Student student){
        for(Klass klass : classes) {
            if (klass.isIn(student)) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
            return super.introduce() +  " I am a Teacher. I don't teach "+student.getName()+".";
    }

    public boolean isTeaching(Student student) {
        for(Klass klass : classes){
            if(student.getNumber().getNumber() == klass.getNumber()){
                return true;
            }
        }
        return false;
    }


}

