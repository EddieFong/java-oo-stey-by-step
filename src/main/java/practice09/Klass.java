package practice09;


public class Klass {
    private int number;

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
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}