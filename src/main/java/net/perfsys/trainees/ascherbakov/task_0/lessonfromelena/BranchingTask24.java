//Ввести координаты точки M (x, y), а также значения x1, x2, y1, y2.
// Определить, принадлежит ли точка области, ограниченной прямоугольником

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask24 {
    public static void main(String[] args) {
        int x = 10; int y = 9;
        int x1 = 10; int x2 = 11; int y1 = 5; int y2 = 7;
        if ((((x>=x1)&&(x<=x2)))&&(((y>=y1)&&(y<=y2)))) System.out.println("Точка принадлежит области, ограниченной прямоугольником");
        else System.out.println("Точка улетела в молоко");
    }
}
