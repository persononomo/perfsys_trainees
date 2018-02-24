//Ввести целое число. Если число четырехзначное, выяснить, является ли оно палиндромом ("перевертышем"),
//т. е. таким числом, десятичная запись которого читается одинаково слева направо и справа налево.
//Если число не четырехзначно, вывести сообщение об ошибке ввода данных.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Scanner;

public class BranchingTask13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scn.nextInt();
        if (a>=1000&&a<=9999) {
            String str = String.valueOf(a);
            int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
            if(numArr[0]==numArr[3]&&numArr[1]==numArr[2]) System.out.println("Число полиндром");
        }else System.out.println("Ошибка ввода данных");
    }
}
