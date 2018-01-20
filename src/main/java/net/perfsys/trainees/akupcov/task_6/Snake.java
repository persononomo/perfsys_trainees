package net.perfsys.trainees.akupcov.task_6;

public class Snake {

    public static void main(String[] args) {
       int indentation = 1;
        int indexArray = 0;
        int row  = 0;
        int column = 0;
        int[][] snakeArray = new int[10][10];
        snakeArray = snakeNumber(snakeArray, indentation, indexArray, row, column);

        for (int i = 0; i < snakeArray.length; i++) {
            for (int j = 0; j < snakeArray.length; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] snakeNumber(int[][] snakeArray, int indentation, int indexArray, int row, int column) {
        int[] array = new int[100];
        RandomNumberArray randomNumberArray = new RandomNumberArray();
        array = randomNumberArray.randomNumberArray(array);
        int numberOfRows = 0;
        if(snakeArray.length % 2 == 0){
            numberOfRows = snakeArray.length / 2;}
        else{ numberOfRows = (snakeArray.length/2) + 1;}

        for (int i = row; i < snakeArray.length - row; i++) {
            for (int j = row; j < snakeArray.length - row; j++) {
                snakeArray[i][j] = array[indexArray] ;
                indexArray++;

                if (j == snakeArray.length - indentation) {
                    for (i = indentation; i < snakeArray.length - row; i++) {
                        snakeArray[i][j] = array[indexArray];
                        indexArray++;
                    }
                    indentation++;
                    column++;
                }
            }
        }
        for (int i = snakeArray.length - indentation; i >= row; i--) {
            for (int j = snakeArray.length - indentation; j >= row; j--) {
                i = snakeArray.length - column;
                snakeArray[i][j] =array[indexArray];
                indexArray++;
                if (j == row) {
                    j = row;
                    for (i = snakeArray.length - indentation; i > row; i--) {
                        snakeArray[i][j] = array[indexArray];
                        indexArray++;
                    }

                }
            }
        }
        row++;
        if (indentation <= numberOfRows) {
            return snakeNumber(snakeArray, indentation, indexArray, row, column);
        } else {
            return snakeArray;
        }
    }
}