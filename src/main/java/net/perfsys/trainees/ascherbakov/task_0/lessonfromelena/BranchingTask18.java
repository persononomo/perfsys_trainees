//Ввести величины трех отрезков и определить, существует ли треугольник с такими сторонами. Если существует, то определить его тип:
//	равносторонний;
//	равнобедренный;
//	разносторонний.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask18 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 5;
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println("Существует такой треугольник");
            if ((a == b) || (b == c) || (c == a)) System.out.println("Треугольник равнобедренный");
            else if ((a != b) && (c != a) && (b != c)) System.out.println("Треугольник разносторонний");
            else if ((a == b) && (c == a) && (b == c)) System.out.println("Треугольник равносторонний");
        } else System.out.println("Такого треугольника не существует");


    }
}
