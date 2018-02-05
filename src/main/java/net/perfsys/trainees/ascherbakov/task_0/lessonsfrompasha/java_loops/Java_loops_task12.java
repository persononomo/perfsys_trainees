//Для введённого пользователем с клавиатуры натурального числа 
//посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_loops;

import java.util.Scanner;

public class Java_loops_task12 {
  public static void main(String[] args) {
        String a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scn.hasNextInt()) {
            a = scn.nextLine();

            int c = 0;
            for (int i = 0; i < a.length(); i++) {
                a.charAt(i);
                c = Character.getNumericValue(a.charAt(i)) + c;
            }

            System.out.println("Сумма всех чисел введенного числа равна " + c);
        } else System.out.println("Ошибка. Вы ввели не число!");
    }
}
