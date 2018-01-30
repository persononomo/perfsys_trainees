//Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
// целое число в интервал (25;100) и сообщать результат на экран.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;

public class SwitchAndMoreLogicTask1 {
    public static void main(String[] args) {
        if(random() > 25 && random() <=100){
            System.out.println("Писло "  + random() + " содержится в интервале от 25 до 100");
        }
        else {
            System.out.println("Писло "  + random() + " не содержится в интервале от 25 до 100");
        }
    }
    public static int random(){
        int a = 5;
        int b = 155;
        return (int) (Math.random() * (b - a) + a);
    }
}
