//Ввести координаты точки M (x, y).
//Определить, принадлежит ли точка области, ограниченной параболой y=x2-6x+5 и прямой, проходящей через точки (0, 1) и (5, 5)

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask27 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int y1 = ((x * x) - 6 * x + 5);
        if (y <= y1) System.out.println("Принадлежит");
        else if (y > y1) System.out.println("Не принадлежит");
    }
}
