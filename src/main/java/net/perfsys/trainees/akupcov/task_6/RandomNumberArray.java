package net.perfsys.trainees.akupcov.task_6;

import java.util.Arrays;

public class RandomNumberArray {
  public int[]  randomNumberArray( int [] array)
    {
        for (int i = 0; i < array.length; i++){
            array[i] =(int) (Math.random() * 100) + 1;

    }
      new ArraySort(array);
      return array;
    }



}
