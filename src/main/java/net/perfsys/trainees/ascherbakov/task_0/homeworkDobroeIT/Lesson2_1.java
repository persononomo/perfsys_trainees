//Написать метод, который получает на вход 3 числа и возвращает сумму лишь положительных из них. К примеру, на вход 1, 100, -2 = 101(-2 - отрицательное).

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson2_1 {
    public static void main(String[] args) {
        System.out.println(getSumOfPositive(10, 2, 3));
    }

    public static int getSumOfPositive(int a, int b, int c) {
        int result = 0;
//        if (a > 0 && b > 0 && c > 0) result = a + b + c;
////        else if (a > 0 && b < 0 && c > 0) result = a + c;
////        else if (a < 0 && b > 0 && c > 0) result = b + c;
////        else if (a > 0 && b > 0 && c < 0) result = a + b;
////        else System.out.println("Нельзя получить сумму, так как 2 числа отрицательны");
        if (a>0) result+=a;
        if (b>0) result+=b;
        if (c>0) result+=c;
        return result;
    }
}
