//Домашнее задание:
//1. Создать иерархию: супертип Animal, реализации - Dog, Cat. В супертипе должен быть объявлен метод void voice(), в подтипах - реализовать данный метод, собака должна печатать на консоль "Гав", кот - "Мяу". У собак и котов должен быть возраст и имя, и методы, позволяющие получать соответственно возраст и имя. Должна быть возможность узнать сколько всего животных было создано.
//2. Создать массив животных, и добавить туда множество котов и собак. Итеративно пройтись по массиву, и распечатать на консоль вид животного, его возраст и имя.
//3. Создать метод, который из созданного в п.2 массива удалит всех котов младше 1 года или старше 8 лет, а также всех собак, чьё имя содержит больше 4 согласных букв.
//4. Создать класс питомник, который будет хранить массив животных. Реализовать метод по добавлению животных в питомник, а также по получению всех животных по типу и диапазону лет включительно(метод должен принимать три аргумента - тип животного, число, соответствующее старту диапазона и число, соответствующее его концу).


package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT.Animals;

public class Main extends Animal {
    public static void main(String[] args) {

        Animal murka = new Cat("Murka", 10);
        Animal wilson = new Dog("Wilsonometra", 5);
        Animal yasha = new Cat("Yasha", 2);
        Animal bonya = new Dog("Bonya", 4);
        Animal ihtiandr = new Cat("Ihtiandr", 1);

        murka.voice();
        wilson.voice();

        System.out.println("Количество созданных животных: " + sumAnimals);

        Object animals[] = new Object[5];
        animals[0] = murka;
        animals[1] = wilson;
        animals[2] = yasha;
        animals[3] = bonya;
        animals[4] = ihtiandr;

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }

        }
    }

