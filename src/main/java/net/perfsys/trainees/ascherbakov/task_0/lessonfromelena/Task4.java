//Определить, что больше: k километров или m миль (1 миля = 1,609 км). Значения k и m ввести с клавиатуры.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите k километров");
        double k = scn.nextDouble();
        System.out.println("Введите m миль");
        double m = scn.nextDouble() * 1.609;
        if (k > m) {
            System.out.println(k + " километров больше " + m + " миль переведенных в километры");
        } else if (m > k) {
            System.out.println(m + " переведеных миль в километры больше " + k + " километров");

        } else if (m == k) {
            System.out.println(m + " переведеных миль в километры равно " + k + " километров");


        }else System.out.println("вы ввели муть");
    }
}
