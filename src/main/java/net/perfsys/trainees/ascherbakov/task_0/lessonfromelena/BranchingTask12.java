//Ввести координаты точки M(x,y). Определить, лежит ли она на осях координат.
//Если лежит, то определить на какой.
//Если не лежит, то определить, какой координатной четверти она принадлежит.
package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask12 {
    public static void main(String[] args) {
        int x = 8;
        int y = -2;
        if( x>0&&y>0) System.out.println("I");
        else if(x<0&&y>0) System.out.println("II");
        else if(x<0&&y<0) System.out.println("III");
        else if(x>0&&y<0) System.out.println("IV");
        else if(x==0&&y>0) System.out.println("Лежит на оси x");
        else if(x==0&&y<0) System.out.println("Лежит на оси x");
        else if(y==0&&x<0) System.out.println("Лежит на оси y");
        else if(y==0&&x>0) System.out.println("Лежит на оси y");

    }
}
