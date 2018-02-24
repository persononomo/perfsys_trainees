//Ввести число и определить, является ли оно двузначным.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class BranchingTask11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scn.nextInt();
        if (a>9 && a<100) System.out.println("Это двухзначное число");
        else System.out.println("Число не двухзначное число");

    }

}
