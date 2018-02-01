//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;
import java.util.Scanner;

public class Java_loops_task7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число и которого нужен факториал");
        long n = scn.nextInt();
        System.out.println("Факториал равен:"+ " " + factorial(n));

    }
    private static long factorial(long a){
        if(a==0) return 1;
        return a*factorial(a-1);
    }

}
