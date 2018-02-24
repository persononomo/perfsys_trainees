//Даны три вещественных числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask14 {
    public static void main(String[] args) {
        int a = 4; int b = 4; int c = 5;
        if (a==b||a==c||b==c) System.out.println("Имеется пара равных между собой чисел");
        else System.out.println("Не имеется");
    }
}
