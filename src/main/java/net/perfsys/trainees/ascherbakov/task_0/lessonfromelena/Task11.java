// Ввести трехзначное число. Определить, какая из его цифр больше: сотни, десятки или единицы.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class Task11 {

    public static void main(String[] args) {
        int r = 298;
        int a = r / 100;
        int b = (r % 100) / 10;
        int c = r % 10;
        if (a >= b && a >= c) {
            System.out.println("Самая большая цифра в числе " + r + ": " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Самая большая цифра в числе " + r + ": " + b);
        } else if (c >= a && c >= b) {
            System.out.println("Самая большая цифра в числе " + r + ": " + c);
        } else System.out.println("Число муть");


    }
}
