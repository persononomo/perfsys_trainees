//Написать программу, которая решает квадратное уравнение: ax2+bx+c=0.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double a, b, c, d;
        double x, x1, x2;
        Scanner scn = new Scanner(System.in);

        System.out.println("Решение уравнения ax2+bx+c=0");
        System.out.println("Введите a,b,c");
        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = ((-b + Math.sqrt(d)) / 2 * a);
            x2 = ((-b - Math.sqrt(d)) / 2 * a);
            System.out.println("Корни уравнения " + x1 + "" + x2);
        } else if (d == 0) {
            x = (-b / 2 * a);
            System.out.println("Корень уравнения" + x);
        } else if (d < 0) {
            System.out.println("Дискриминант меньше нуля");
        } else System.out.println("Вообще черти чо");
    }
}
