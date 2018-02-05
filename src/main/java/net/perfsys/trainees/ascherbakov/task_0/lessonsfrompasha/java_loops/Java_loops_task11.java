//Выведите на экран первые 11 членов последовательности Фибоначчи.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

public class Java_loops_task11 {

private static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " : " + fib(i));

        }

    }
}
