////Написать функцию, принимающую на вход целое число, и возвращающую факториал данного числа. Рекурсивная версия.

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson2_4_1 {
    public static void main(String[] args) {
        System.out.println(calcFactorial(25));
    }
    static long calcFactorial(int a){

        long result;
        if (a == 1)
            return 1;
        result = calcFactorial(a - 1) * a;
        return result;
    }
}

