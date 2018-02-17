//Поезд отправился со станции A в h:m (h часов, m минут).
//Через dh часов и dm минут он прибыл на станцию B. Определить время прибытия поезда на станцию B.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask6 {
    public static void main(String[] args) {
        int hourA = 1;
        int minutesA = 59;

        int dh = 3;
        int dm = 30;

        int tempA = hourA * 3600 + minutesA*60;
        int tempdh = dh * 3600 + dm*60;
        int tempB = tempA + tempdh;
        int hourB = (tempB / 3600)%25;
        int temp = tempB % 3600;
        int minutesB = (tempB % 3600) / 60;
        int secB = temp % 60;

        System.out.println("Время прибытия поезда на станцию B " + hourB + ":" + minutesB + ":" + secB);
    }
}
