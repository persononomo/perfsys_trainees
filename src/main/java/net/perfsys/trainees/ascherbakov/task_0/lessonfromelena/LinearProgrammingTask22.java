//Известно, что 1 миля = 1.609 км. Написать программу, которая переводит мили в км.
//Результат вывести в виде: «___ км и ___ м». Вводимое количество миль может быть не целым числом.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LinearProgrammingTask22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество миль");
        double miles = scn.nextDouble();
        double km = miles*1.609;
        BigDecimal okruglkm = new BigDecimal(km).setScale(2, RoundingMode.HALF_UP);
        System.out.println(okruglkm + " км = " + "равно " + miles + " милям" );

    }
}
