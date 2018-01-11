package net.perfsys.trainees.ascherbakov.task_0;
import java.util.Random;
import java.util.Arrays;

public class Snake {
    public static void main(String[] args) {
        Random r = new Random();
        int lengthArray = 99;
        int[][] newArray = new int[10][10];
        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                newArray[i][j] = r.nextInt(lengthArray);
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
