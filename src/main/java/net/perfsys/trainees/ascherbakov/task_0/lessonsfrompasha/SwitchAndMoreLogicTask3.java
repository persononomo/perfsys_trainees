
//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//Создать программу, которая переставит числа в переменных таким образом,
//чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;

public class SwitchAndMoreLogicTask3 {
    public static void main(String[] args) {
        int a = 276;
        int b = 983;
        int c = 129;
        int temp;
//        int [] array = {a,b,c};
//        Arrays.sort(array);
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i] + "\t");
//        }
//        System.out.println();
        System.out.println("Числа в переменных a, b, c : " + a + "\t" + "\t" + b + "\t" + "\t" + c);
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Типо сортировка a, b, c : " + a + "\t" + "\t" + b + "\t" + "\t" + c);
    }

}

