//Часы показывают время h:m:s. Определить, сколько секунд прошло с начала суток.


package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class LinearProgrammingTask4 {
    public static void main(String[] args) {
        String s = "22:11:36";
        int hour = 22;
        int minutes = 11;
        int sec = 36;
        int result = sec+minutes*60+hour*3600;
        System.out.println("С начала суток прошло " + result + " секунд");
    }
}
