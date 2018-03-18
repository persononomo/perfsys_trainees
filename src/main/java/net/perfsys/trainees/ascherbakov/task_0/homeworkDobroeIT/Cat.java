package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Cat extends Animal {

    void voice() {
        System.out.println("Meow");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
