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
        int[] numArrReverse = {numArr[1], numArr[0], numArr[3], numArr[2]};
        String tmp = "";
        for (int i = 0; i < numArrReverse.length; i++) {
            tmp += numArrReverse[i];
        }

        int num1 = Integer.parseInt(str);
        int num2 = Integer.parseInt(tmp);
        System.out.println(num1 + num2);

    }
}
