//Расстояние между городами A в пункт B – S км.
//Поезд уходит из пункта A в пункт B со скоростью V1  км/ч.
//Через t часов после этого из пункта B в пункт A выехал автобус со скоростью V2 км/ч.
//Определить, через какое время после отправления поезда они встретятся.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask16 {
    public static void main(String[] args) {
        int s = 560; //Расстояние между городами.
        int v1 = 70; //Скорость поезда.
        int v2 = 140; //Скорость автобуса.
        int t1 = 5; //Через t1 выехал автобус.
        int timeOfMeeting = (v1 * t1) / v2;
        System.out.println("Через " + timeOfMeeting + " часа автобус встретит поезд");


    }
}
