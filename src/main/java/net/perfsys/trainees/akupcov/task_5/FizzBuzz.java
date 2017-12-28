package net.perfsys.trainees.akupcov.task_5;
//Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем, программа должна
// выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати, то программа должна
// выводить слово FizzBuzz.
// Задача может показаться очевидной, но нужно получить наиболее простое и красивое решение.

public class FizzBuzz {
    public static void main(String[] args) {

        int i = (int) (Math.random() * 100) + 1;
        int a = i % 3;
        int b = i % 5;
        if(a == 0 &&  b == 0){
            System.out.println("FizzBizz");
        }else if(a == 0 &&  b != 0 ){
            System.out.println("Fizz");
        }else if(a != 0 &&  b == 0){
            System.out.println("Bizz");
        }else {
            System.out.println(i);
        }

       }

    }
