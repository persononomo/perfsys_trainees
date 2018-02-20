//Ввести двузначное число. Определить сумму его цифр.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class LinearProgrammingTask8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите двухзначное число");
            int a = scn.nextInt();
            int firstNum = a/10;
            int secondNum = a%10;
            int sum = firstNum+secondNum;
        System.out.println("Первая цифра " + firstNum + "," + " Вторая цифра " + secondNum
         + "," + "Сумма цифр " + sum);

    }
}
