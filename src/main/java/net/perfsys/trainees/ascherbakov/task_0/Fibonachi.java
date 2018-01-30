package net.perfsys.trainees.ascherbakov.task_0;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fib(51));
    }
    private static int fib (int n){
        if (n==1 || n==2){
            return 1;
        }
        return fib(n-2) + fib (n-1);
    }
}
