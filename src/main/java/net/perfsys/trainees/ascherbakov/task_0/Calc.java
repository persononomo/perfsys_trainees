package net.perfsys.trainees.ascherbakov.task_0;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введи операцию");
        String operation = scn.next();

        double a, b;
        System.out.println("Введи первое число");
        a = scn.nextInt();
        System.out.println("Введи второе число");
        b = scn.nextInt();

        char i = 'a';
        int i1 = Integer.parseInt(String.valueOf(i));

        switch (operation) {
            case "+":
                System.out.println("Сумма равна " + (a + b));
                break;
            case "-":
                System.out.println("Разница " + (a - b));
                break;
            case "/":
                System.out.println("Результат деления " + (a / b));
                break;
            case "*":
                System.out.println("Результат умножения " + (a * b));
                break;
            default:
                System.out.println("Error");
        }
    }

}
