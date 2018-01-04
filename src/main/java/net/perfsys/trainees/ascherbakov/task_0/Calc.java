package net.perfsys.trainees.ascherbakov.task_0;

import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a, b, result;
        int operation = 'o';
        String sum = "+";
        String dif = "-";
        String div = "/";
        String mul = "*";


        switch (operation) {
            case '+':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();
                if (sum.equals("+")) {
                    result = a + b;
                    System.out.println("Сумма равна " + result);
                }
                break;
            case '-':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();
                if (dif.equals("-")) {
                    result = a - b;
                    System.out.println("Разница " + result);
                }
                break;
            case '/':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();
                if (div.equals("/")) {

                    result = a / b;
                    System.out.println("Результат деления " + result);
                }
                break;
            case '*':
                System.out.println("Введи первое число");
                a = scn.nextInt();
                System.out.println("Введи второе число");
                b = scn.nextInt();
                if (mul.equals("*")) {

                    result = a * b;
                    System.out.println("Результат умножения " + result);
                }
                break;
        }
    }

}
