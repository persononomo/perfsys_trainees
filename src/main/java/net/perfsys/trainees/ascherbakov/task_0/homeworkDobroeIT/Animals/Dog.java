package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT.Animals;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
        sumAnimals++;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        sumAnimals++;
    }

    public Dog() {
        sumAnimals++;
    }

    void voice() {
        System.out.println("Wof");
    }


}
