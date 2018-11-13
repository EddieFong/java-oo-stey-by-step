package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    public boolean isTeaching(Student student){
        for(Klass klass:classes){
            if(klass.getNumber()==student.getKlass().getNumber()){
                return true;
            }
        }
        return false;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

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
        if (this.classes == null) {
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        String classList = "";
        for (int i=0; i<classes.size(); i++){
            classList += (i==0 ) ? classes.get(i).getNumber() : ", " + classes.get(i).getNumber();
        }
        return super.introduce()+" I am a Teacher. I teach Class " + classList + ".";
    }

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == classes.get(0).getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}