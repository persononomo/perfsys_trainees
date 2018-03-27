package net.perfsys.trainees.ascherbakov.task_0.homeworkDobroeIT;

import java.util.Arrays;

public class Lesson3_5 {
    public static void main(String[] args) {
        int[] array = {4,7,9,6,4,6,2,1,7,8,9};
        System.out.println(Arrays.toString(array));
        int[] result = transformation(array);
        System.out.println(Arrays.toString(array));
    }
    private static int [] transformation(int[] array){
        Arrays.sort(array);
        int maxIndex = array.length-1;
        int maxVal = array[maxIndex];
        int[] resultArray = new int [maxVal +1];

        for (int i = 0; i <= maxIndex; i++) {
            int val = array[i];
            int tmp = resultArray[val];
            resultArray[val] = tmp +1;
        }
        return resultArray;
    }
}
