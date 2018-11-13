package practice11;


public class Klass {
    private int number;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Teacher teacher;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    private Student leader;

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
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if(student.getKlass().getNumber() != number) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.setLeader(student);
        if (this.teacher != null) {
            System.out.print("I am " + this.teacher.getName() + ". I know " + student.getName() + " become Leader of Class " + student.getKlass().getNumber() + ".\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (this.teacher != null) {
            System.out.print("I am " + this.teacher.getName() + ". I know " + student.getName() + " has joined Class " + student.getKlass().getNumber() + ".\n");
        }
    }
}