//Ввести два числа. Определить, делится ли большее из них на меньшее.

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class Task5 {
    public static void main(String[] args) {
        double a = 2;
        double b = 20;
        boolean result = true;
        if (a > b) {
            if (a % b == 0) {
                System.out.println(result);
            } else {
                
            }
        } else {
            if (a == b) {
                
            } else {
                if (b % a == 0) {
                    System.out.println(result);
                    
                } else {
                    
                    
                }
            }
        }
    }
}
