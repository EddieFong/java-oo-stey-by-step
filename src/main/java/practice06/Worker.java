package practice06;

import practice03.Person;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        return super.introduce() + " " + "I am a Worker. I have a job.";
    }
}