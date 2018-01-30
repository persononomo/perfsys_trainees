package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;

public class Lesson06 {
    public static void main(String args[]) {
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0 && a % 5 != 0) System.out.println("Fizz");
            else if (a % 3 != 0 && a % 5 == 0) System.out.println("Buzz");
            else if (a % 15 == 0) System.out.println("FizzBuzz");
            else System.out.println(" Число " + a);
        }
    }
}


//    public static void main(String args[]) {
//        printFizzBuzz(100,3, 5);
//
//    }
//
//    private static void printFizzBuzz(int length, int a, int b) {
//        for (int i = 0; i < length; i++) {
//            if (i % a == 0) System.out.println("Fizz");
//            else if (i % b == 0) System.out.println("Buzz");
//            else if (i % a * b == 0) System.out.println("FizzBuzz");
//            System.out.println(" Число " + i);
//        }
//    }
