package net.perfsys.trainees.ascherbakov.task_0;

public class Symbols {
    public static void main(String args[])
        throws java.io.IOException{
            char ch;
            int spaces = 0;

            System.out.println("Для остановки введите точки.");

            do {
                ch = (char) System.in.read();
                if (ch == ' ') spaces++;
            } while (ch != '.');

            System.out.println("Пробелов: " + spaces);




        }


    }
