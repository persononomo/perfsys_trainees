//Ввести величины трех отрезков и определить, существует ли треугольник с такими сторонами.
//Если существует, то определить, является ли он прямоугольным.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask17 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println("Существует такой треугольник и он не прямоугольный");
            if ((Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
                    (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) ||
                    (Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)))
                System.out.println("Треугольник прямоугольный");
        } else System.out.println("Это какая то муть, а не треугольник");

    }
}
