//С начала некоторых суток прошло n секунд.
//Определить, какое время показывают часы в формате h:m:s.
//Предусмотреть, что количество часов не может быть больше 23.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask5 {
    public static void main(String[] args) {

        int n = 65790; // входное условие секунд должно быть <82800.
        int hour = n / 3600;
        int temp = n % 3600;
        int minutes = (n % 3600) / 60;
        int sec = (temp % 60);
        System.out.println("В " + n + " секундах " + hour + ":" + minutes + ":" + sec);
    }


}
