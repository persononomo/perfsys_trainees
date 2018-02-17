//Ввести два целых числа a и b. Если a делится на b или b делится на a вывести 1, иначе – любое другое число.
//Условные операторы и операторы цикла не использовать.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask7 {
    public static void main(String[] args) {
        int a =3;
        int b =12;
        System.out.println(Math.abs(a%b)*Math.abs(b%a) + "1");
    }
}
