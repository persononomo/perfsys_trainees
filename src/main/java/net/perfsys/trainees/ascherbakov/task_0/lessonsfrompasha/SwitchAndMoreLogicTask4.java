package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha;

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
