package practice07;

import practice02.Person;

public class Student extends Person{

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + " " + "I am a Student. I am at Class " + klass + ".";
    }
}