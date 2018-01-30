package net.perfsys.trainees.ascherbakov.task_0.lessonsfrombook;

import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a, b, result;
        char operation = 'o';

        char i = 'a';
        int i1 = Integer.parseInt(String.valueOf(i));

        switch (operation) {
            case '+':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();

                result = a + b;
                System.out.println("Сумма равна " + result);
                break;
            case '-':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();

                result = a - b;
                System.out.println("Разница " + result);
                break;
            case '/':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();

                result = a / b;
                System.out.println("Результат деления " + result);
                break;
            case '*':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();

                result = a * b;
                System.out.println("Результат умножения " + result);
                break;
            default:
                System.out.println("Error");
        }
    }

}
