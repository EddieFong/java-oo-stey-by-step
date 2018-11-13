package practice08;

public class Teacher extends Person {

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        if (klass == null) {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}