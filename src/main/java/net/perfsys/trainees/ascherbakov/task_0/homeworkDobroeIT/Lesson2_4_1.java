////Написать функцию, принимающую на вход целое число, и возвращающую факториал данного числа. Рекурсивная версия.

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson2_4_1 {
    public static void main(String[] args) {
        System.out.println(factorial(25));
    }
   public static long factorial(int n)

    {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}

