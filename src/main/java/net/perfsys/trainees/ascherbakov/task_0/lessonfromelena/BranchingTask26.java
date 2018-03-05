//Ввести координаты точки M (x, y). Определить, принадлежит ли точка области, ограниченной трапецией

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask26 {
    public static void main(String[] args) {
        int x = 12;
        int y = 4;
        int x1 = 5;
        int y1 = -2;
        int y3 = 3;
        int y2 = 2;
        if (((x >= 0) && (x <= x1)) && ((y >= y1) && (y <= y2))) System.out.println("Точка принадлежит трапеции");
        else System.out.println("Не принадлежит");
    }
}
