package net.perfsys.trainees.ascherbakov.task_0.lessonsfrombook;

class StaticSuper {
    static {
        System.out.println("Parents static block");
    }
    StaticSuper() {
        System.out.println("Parents constructor");
    }
}

public class StaticTests extends StaticSuper{
    static int rand;

    static {
        rand = (int)(Math.random()*6);
        System.out.println("Static block" + rand);
    }
    StaticTests(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main");
        StaticTests st = new StaticTests();
    }
}

