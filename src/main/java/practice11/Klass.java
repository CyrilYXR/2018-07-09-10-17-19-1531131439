package practice11;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List member = new LinkedList<>();

    public List getMember() {
        return member;
    }

    public void setMember(List member) {
        this.member = member;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+this.number;
    }

    public void assignLeader(Student student) {
        this.leader = student;
        System.out.println("It is not one of us.");
    }

    public void appendMember(Student student) {
        if(!member.contains(student)){
            member.add(student);
        }
    }
}
