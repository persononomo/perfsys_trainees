package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT.Animals;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
        sumAnimals++;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        sumAnimals++;
    }

    public Cat() {
        sumAnimals++;

    }

    void voice() {
        System.out.println("Meow");
    }

}
