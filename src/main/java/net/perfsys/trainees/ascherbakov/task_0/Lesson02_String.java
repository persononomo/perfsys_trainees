package net.perfsys.trainees.ascherbakov.task_0;

import java.util.stream.Stream;

public class Lesson02_String {
    public static void main(String args[]) {

        int a = 394;
        System.out.println(
                Stream
                        .of(String.valueOf(a).split(""))
                        .map(Integer::valueOf)
                        .reduce(0, Integer::sum)
        );
    }
}
