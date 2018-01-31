//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.

package net.perfsys.trainees.ascherbakov.task_0.lessonsfrompasha.java_switch_and_more_logic;

public class SwitchAndMoreLogicTask2 {
        public static void main(String[] args) {
            int r = random();
            int a = r/100;
            int b = (r%100)/10;
            int c = r%10;
            if(a>=b&&a>=c) {
                System.out.println("Самая большая цифра в числе " + r + ": "+ a );
            }else if(b>=a&&b>=c) {
                System.out.println("Самая большая цифра в числе " + r + ": "+ b );
            }else if(c>=a&&c>=b) {
                System.out.println("Самая большая цифра в числе " + r + ": "+ c );
            }else System.out.println("Число муть");


        }
        private static int random() {
            int a = 100;
            int b = 999;
            return (int) (Math.random() * (b - a) + a);
        }
    }
