//Определить, являются ли на шахматной доске поля (x1, y1) и (x2, y2) полями одного цвета.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask30 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x = 5;
        int y = 6;
        if ((x1 >= 1 && x1 <= 8) && (x >= 1 && x <= 8) && (y1 >= 1 && y1 <= 8) && (y >= 1 && y <= 8)) {
            if ((x1+x+y+y1)%2==0) System.out.println("Поля одного цвета");
            else System.out.println("Поля разного цвета");
        } else System.out.println("Координаты не попадают в необходимый диапазон");
    }
}
