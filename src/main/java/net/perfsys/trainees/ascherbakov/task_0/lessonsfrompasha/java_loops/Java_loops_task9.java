//Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
// Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
// Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

import java.util.Scanner;

public class Java_loops_task9 {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(scn.hasNextInt()){
            int n = scn.nextInt();
            for(int i=(int)Math.sqrt(n);i>=1;i--){
                if(n%i==0&i!=1){
                    System.out.println("Заданное число - составное");
                    break;
                }
                if(i==1) System.out.println("Заданное число простое");
            }
        }
        else System.out.println("Ошибка. Введена полная муть");

    }
}