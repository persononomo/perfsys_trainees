//Ввести три разных числа. Определить, какое из них больше: первое, второе или третье.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class Task10 {
    public static void main(String[] args) {
        int a = 12;
        int b = 56;
        int c = 24;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else System.out.println(c);

    }
}
