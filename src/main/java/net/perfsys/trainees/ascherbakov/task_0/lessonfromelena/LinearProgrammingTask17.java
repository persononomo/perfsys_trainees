//Ввести три целых числа. Определить их среднее арифметическое. Результат округлить до двух знаков после запятой.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LinearProgrammingTask17 {
//    public static void main(String[] args) {
//        int[] array = new int[3];
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите 3 целых числа: ");
//        array[0] = scn.nextInt();
//        array[1] = scn.nextInt();
//        array[2] = scn.nextInt();
//
//        OptionalDouble average = Arrays.stream(array).average();
//        System.out.println(average);
//    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите 3 целых числа: ");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        double avarage = (a+b+c)/3;
        BigDecimal bigDecimal = new BigDecimal(avarage).setScale(2, RoundingMode.HALF_UP);


//        DecimalFormat df = new DecimalFormat("#.##");
//        String avarage1 = df.format(avarage);
        System.out.println("Среднее арифмитическое трех чисел: " + bigDecimal);
    }
}
