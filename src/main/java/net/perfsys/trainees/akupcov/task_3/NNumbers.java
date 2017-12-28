package net.perfsys.trainees.akupcov.task_3;
//4. В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и
// выводящую на экран сумму цифр числа n.

public class NNumbers {
    public static void main(String[] args) {
        int nNumber = SumNNumbers(5679);
        System.out.println(nNumber);

    }

    public static int SumNNumbers(int a) {
        int n = 0;
        String Number = String.valueOf(a);
        char[] strToArray = Number.toCharArray();
        for(int i = 0; i < strToArray.length; i++){
            int b = Character.getNumericValue(strToArray[i]);
            n+=b;
        }

        return n;
    }
}
