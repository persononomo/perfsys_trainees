//Ввести координаты дух точек на координатной плоскости M1 (x1, y1) и M2 (x2, y2).
//Составить программу вычисления расстояния между этими точками.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask20 {
    public static void main(String[] args) {
        //точка M1
        double x1 = 12;
        double y1 = 15;
        //точка М2
        double x2 = 10;
        double y2 = 17;

        double lengthPoints = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Расстояние между двумя точками: " + lengthPoints);
    }
}
