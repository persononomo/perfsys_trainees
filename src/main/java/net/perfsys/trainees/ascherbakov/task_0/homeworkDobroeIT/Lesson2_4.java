//Написать функцию, принимающую на вход целое число, и возвращающую факториал данного числа. Итеративная версия.

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson2_4 {
    static int calcFactorial(int n){
        int result = 1;
        for (int i = 2; i <=n; i ++){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calcFactorial(5));
    }
}

