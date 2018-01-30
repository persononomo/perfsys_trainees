package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;

//import java.util.Date;

import java.util.Date;

public class Fibonachi {
    public static void main(String[] args) {
        int n = 10000;
        long fib;
        long fib2;
        long before;
        long after;

//        before = new Date().getTime();
//        fib = fib(n);
//        after = new Date().getTime();
//        System.out.println(n + " - " + fib + " - " + (after - before) + " ms");

        before = new Date().getTime();
        fib2 = fib2(n);
        after = new Date().getTime();

        System.out.println(n + " - " + fib2 + " - " + (after - before) + " ms");
    }


    private static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    private static long fib2(int n) {
        long a = 1;
        long b = 1;
        long fib = 0;
        for (int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}


