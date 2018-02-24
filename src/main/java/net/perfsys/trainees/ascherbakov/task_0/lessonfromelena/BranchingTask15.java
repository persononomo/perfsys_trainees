//Ввести целое число N (1≤N≤12), которое обозначает порядковый номер месяца.
//Определить, сколько в этом месяце дней.
//Если введенный месяц февраль, то ввести еще и номер года (для определения, високосный ли он).
//Високосный год: кратный 4, но не кратный 100, НО кратный 400.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

import java.util.Scanner;

public class BranchingTask15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("INPUT MONTH NUMBER");
        int month = scn.nextInt();
        switch (month) {
            case 1:
                System.out.println("JANUARY, 31 days");
                break;
            case 2:
                System.out.println("INPUT YEAR: ");
                int year = scn.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println("FEBRUARY, 29 days");
                } else System.out.println("FEBRUARY, 28 days");
                break;
            case 3:
                System.out.println("MARCH, 31 days");
                break;
            case 4:
                System.out.println("APRIL, 30 days");
                break;
            case 5:
                System.out.println("MAY = 31 days");
                break;
            case 6:
                System.out.println("JUNE = 30 days");
                break;
            case 7:
                System.out.println("JULY = 31 days");
                break;
            case 8:
                System.out.println("AUGUST = 31 days");
                break;
            case 9:
                System.out.println("SEPTEMBER = 30 days");
                break;
            case 10:
                System.out.println("OCTOBER = 31 days");
                break;
            case 11:
                System.out.println("NOVEMBER = 30 days");
                break;
            case 12:
                System.out.println("DECEMBER = 31 days");
                break;
            default:
                System.out.println("Fuck off");
        }

    }
}
