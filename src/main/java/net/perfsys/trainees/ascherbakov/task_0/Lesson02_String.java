package net.perfsys.trainees.ascherbakov.task_0;

public class Lesson02_String {
    public static void main(String args []){

        int a = 38;

        String a_string = String.valueOf(a);

        char[] charArray = a_string.toCharArray();

        int result = 0;

        for (char aCharArray : charArray) {
            result += Integer.valueOf(String.valueOf(aCharArray));
        }

        System.out.println(result);
    }
}
