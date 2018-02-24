//Ввести величины трех отрезков и определить, существует ли треугольник с такими сторонами.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask16 {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 10;
        if ((a + b > c) && (a + c > b) && (c + b > a)) System.out.println("Существует такой треугольник");
        else System.out.println("Это какая то муть");
    }
}
