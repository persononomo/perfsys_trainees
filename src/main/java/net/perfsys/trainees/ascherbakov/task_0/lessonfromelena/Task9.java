//Ввести год. Определить, является ли он високосным.
//Високосный год: кратный 4, но не кратный 100, НО кратный 400.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class Task9 {
    public static void main(String[] args) {
        int year = 2001;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Високосный год");
        } else System.out.println("Простой год");
    }
}

