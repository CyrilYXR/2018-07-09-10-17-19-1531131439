package practice11;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> member = new LinkedList<>();
    private List<Teacher> teachers = new LinkedList<>();
    private String studentStatus;

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    private String leaderStatus;

    public List getMember() {
        return member;
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
        if(student.getNumber().getNumber() != this.number) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        student.setNumber(this);
        this.leaderStatus = student.getName();
        for (Teacher teacher : teachers) {
            teacher.setNumber(this);
            teacher.attend(student);
            this.leaderStatus = null;
        }
    }

    public void setMember(List<Student> member) {
        this.member = member;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String getLeaderStatus() {
        return leaderStatus;
    }

    public void setLeaderStatus(String leaderStatus) {
        this.leaderStatus = leaderStatus;
    }

    public void appendMember(Student student) {
        if(!member.contains(student)){
            member.add(student);
            student.setNumber(this);
            this.studentStatus = student.getName();
            for (Teacher teacher : teachers) {
                teacher.setNumber(this);
                teacher.attend(student);
                this.studentStatus = null;
            }
        }
    }

    public Boolean isIn(Student student){
        return this.number == student.getNumber().getNumber();
    }
}
