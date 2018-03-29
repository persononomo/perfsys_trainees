package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT.Animals;

public class Animal {
    int age;
    String name;
    static int sumAnimals = 0;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        sumAnimals++;
    }
    public Animal(String name) {
        this.name = name;
        sumAnimals++;
    }


    public Animal() {
        sumAnimals++;

    }
    void voice() {
    }
    void dyingVoice(){}

}

