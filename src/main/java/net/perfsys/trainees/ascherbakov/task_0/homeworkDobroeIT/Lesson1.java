//3) Написать программу, создающую три целочисленных переменных с произвольными значениями, и выводящую на консоль сумму трёх переменных.
//4) Создать переменную с произвольным символом. Конвертировать символ в число, и вывести результат на консоль.
//5) Создать программу, конвертирующую более узкий тип к более широкому.
//6) Создать программу, конвертирующую более широкий тип к более узкому. Создать ситуацию, в которой часть данных более широкого типа теряется.
//7) Запомнить 8 примитивных типов данных, их свойства и особенности. Создать по одной переменной каждого типа.

package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

public class Lesson1 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        System.out.println("Сумма трех переменных: " +(a+b+c));

        char chr = 'д';
        int chrToInt = chr;
        System.out.println("Конвертерированный символ: " +chrToInt);

        byte byt = 23;
        int butToInt = byt;

        double shirokiuTip = 6566666.65;
        int uzkiyTip = (int)shirokiuTip;
        System.out.println(uzkiyTip);

        byte p = 2;
        short sh = 2323;
        int z = 65536;
        long l = 999999;
        double dou = 23.32;
        float floa = 232.23f;
        boolean bol = false;
        char kl = 'k';



    }
}
