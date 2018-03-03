//Ввести координаты точки M (x, y).
// Определить, принадлежит ли точка области, ограниченной осью абсцисс, ординат и прямой, заданной уравнением: y= –x+6.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask25 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int y1 = (-x+6);
        if (y<=y1) System.out.println("Принадлежит");
        else if(y>y1) System.out.println("Не принадлежит");
    }
}
