//Ввести два числа. Определить, какое из них больше: первое, второе или они равны.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class Task3 {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        if (a > b) {
            System.out.println("Число a больше b");
        } else if (a < b) {
            System.out.println("Число b больше а");

        } else if (a == b) {
            System.out.println("Число a равно b");
        }
    }
}

