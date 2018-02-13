//Написать программу, которая решает линейное уравнение: ax+b=0.
package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Уравнение ax + b = 0");
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите a");
        double a = scn.nextDouble();
        System.out.println("Введите b");
        double b = scn.nextDouble();
        double x = (-1 * b) / a;
        System.out.println("Результат решения " + x);
    }
}
