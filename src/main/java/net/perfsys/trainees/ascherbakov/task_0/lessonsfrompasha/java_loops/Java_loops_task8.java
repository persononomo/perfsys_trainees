//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

import java.util.Scanner;

public class Java_loops_task8 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(scn.hasNextInt()){
        int n = scn.nextInt();
            System.out.print("Делителями числа "+n+" являются ");
            for(int i=n;i>0;i--){
                int b=n%i;
                if(b==0)
                    System.out.print(i+" ");
            }
        }
        else System.out.println("Ошибка. Введена полная  хрень");

    }
}

