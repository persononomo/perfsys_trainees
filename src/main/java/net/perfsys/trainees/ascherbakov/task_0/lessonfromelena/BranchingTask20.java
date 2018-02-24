//Ввести три целых числа. Определить, какое из них больше: первое, второе или третье.
//Если нет одного большего числа (например, введены числа 1, 2, 2), то выдать соответствующее сообщение.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask20 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 4;
        if (a > b && a > c) System.out.println("первое больше");
        else if (b > a && b > c) System.out.println("второе больше");
        else if (c > a && c > b) System.out.println("третье больше");
        else if (a == b) System.out.println("первое и второе равны");
        else if (b == c) System.out.println("второе и третье равны");
        else if (a == c) System.out.println("первое и третье равны");
    }
}
