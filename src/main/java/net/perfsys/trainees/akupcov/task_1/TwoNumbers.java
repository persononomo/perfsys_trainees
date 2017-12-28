package net.perfsys.trainees.akupcov.task_1;
//2. В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и
// выводящую на экран сумму цифр числа n.

public class TwoNumbers {
    public static void main(String[] args) {
        int Number = 38;
       int s = SumTwoNumbers(Number);
        System.out.println(s);
    }
    public static int SumTwoNumbers(int a){
        int b = a % 10;
        int n = a / 10;
        return n + b;
//        String Number = String.valueOf(a);
//        char[] strToArray = Number.toCharArray();
//        int b1 = Character.getNumericValue(strToArray[0]);
//        int b2 = Character.getNumericValue(strToArray[1]);
//return a = b1 + b2;
    }
}
