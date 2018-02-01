package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.other;

import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        sum(n, sum);
    }

    public static void sum(int n, int sum) {
        if (n != 0) {
            sum += n % 10;
            sum(n / 10, sum);
        } else System.out.println(sum);
    }
}
