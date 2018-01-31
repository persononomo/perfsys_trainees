package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;
import java.util.Arrays;


//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//Создать программу, которая переставит числа в переменных таким образом,
//чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

public class SwitchAndMoreLogicTask3 {
    public static void main(String[] args) {
        int a = 56; int b = 54; int c = 1;
        int [] array = {a,b,c};
        Arrays.sort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
//        System.out.println("Числа в переменных a, b, c : " + a+ "\t"+"\t"+ b +"\t"+ "\t"+c);
//        if(a>b&&a>c){
//            System.out.println("Типо сортировка a, b, c : " + b+ "\t"+"\t"+ c +"\t"+ "\t"+a);
//        }
//        if(b>c&&b>a){
//            System.out.println("Типо сортировка a, b, c : " + c+ "\t"+"\t"+ a +"\t"+ "\t"+b);
//        }
//        if(c<=a&&c<=b) {
//            a = c;
//        }

    }
}
