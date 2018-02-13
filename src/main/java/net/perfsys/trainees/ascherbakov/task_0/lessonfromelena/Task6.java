//Ввести две скорости: одну в километрах в час, другую в метрах в секунду. Определить, какая из скоростей больше.
package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class Task6 {
    public static void main(String[] args) {
        double kmhour = 5; //км/час
        double msec = 98; //м/с

        double kmhour2 = (msec * 5) / 18;

        if (kmhour > kmhour2) {
            System.out.println("Скорость в км/час больше скорости в м/c");
        }else System.out.println("Скорость в м/с больше скорости в км/час");

    }
}
