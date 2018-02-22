//Ввести радиус окружности. Определить длину окружности и площадь круга с таким радиусом.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class LinearProgrammingTask15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        double radius = scn.nextDouble();
        double c = 2 * Math.PI * radius;
        double s = Math.PI * (Math.pow(radius, 2));
        System.out.println("Длина окружности: " + c);
        System.out.println("Площадь круга: " + s);
    }
}
