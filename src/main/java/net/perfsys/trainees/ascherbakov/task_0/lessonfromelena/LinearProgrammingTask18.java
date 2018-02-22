//Ввести значения переменных x и y. Составить программу вычисления значения функций
//z=(x+(2+y)/x^2 )/(y+1/√(x^2+10))	q = 2,8 sin x + |y|	t=2^(x^y )/2x

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;


public class LinearProgrammingTask18 {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;

        double z = (x + (2 + y) / x * x) / (y + (1 / Math.sqrt(x * x + 10)));
        double q = 2.8 * Math.sin(x) + Math.abs(y);
        double tmp = Math.pow(x, y);
        double t = (Math.pow(2, tmp)) / 2 * x;

        System.out.println("z = " + z);
        System.out.println("q = " + q);
        System.out.println("t = " + t);
    }
}
