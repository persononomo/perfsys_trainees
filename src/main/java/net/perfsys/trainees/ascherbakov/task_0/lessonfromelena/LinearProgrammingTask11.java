//Пользователь вводит четырехзначное число. В нем меняют местами тысячи с сотнями и десятки с единицами.
//Найти сумму исходного числа и нового полученного числа. (Например, введено 1234, получено 2143, сумма 1234+2143=3377).

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProgrammingTask11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите четырехзначное число:");
        String str = scn.nextLine();
        int[] numArr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        int a = numArr[0]+numArr[1]+numArr[2]+numArr[3];
        System.out.println(a);
    }
}
