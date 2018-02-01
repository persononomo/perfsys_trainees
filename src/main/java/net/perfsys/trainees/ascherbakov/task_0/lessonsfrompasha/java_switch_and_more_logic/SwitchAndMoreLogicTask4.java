//Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза о
// количестве полных часов, содержащихся в n секундах.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_switch_and_more_logic;

public class SwitchAndMoreLogicTask4 {
    public static void main(String[] args) {
       int n = random();
       int sec = 3600;
       int hour = n/3600;
        System.out.println(n);
       if(n<3600){
           System.out.println("Less then hour remaining");
       }
       else {
            System.out.println(  hour +" "+ "hour"+"  " +"  "+ "remaining");
        }

    }
    public static int random() {
        int a = 0;
        int b = 28800;
        return (int) (Math.random() * (b - a) + a);
    }
}
