//Ввести четыре вещественных числа. Определить, сколько из них отрицательных.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask21 {
    public static void main(String[] args) {
        int a = -2;
        int b = -1;
        int c = -2;
        int d = -3;
        int kolvootric = 0;
        if (a < 0) kolvootric++;
        if (b < 0) kolvootric++;
        if (c < 0) kolvootric++;
        if (d < 0) kolvootric++;
        System.out.println("Количество отрицательных чисел: " + kolvootric);

    }
}
