package by.lesson.Array;

import java.util.Arrays;
import java.util.Random;

public class WorkWithArray {

    public static void main(String[] args) {
        WorkWithArray workWithArray = new WorkWithArray();
        int[] arrayNumbers = workWithArray.generatorRandomNumbers(100);
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println(workWithArray.maxNumber(arrayNumbers));
        System.out.println(workWithArray.minNumber(arrayNumbers));
    }

    private int maxNumber(int[] numberArray) {
        int max = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
            }
        }
        return max;
    }

    private int minNumber(int[] numberArray) {
        int min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {
            if (min > numberArray[i]) {
                min = numberArray[i];
            }
        }
        return min;
    }

    private int[] generatorRandomNumbers(int sizeArray) {
        int[] numberArray = new int[sizeArray];
        Random random = new Random();
        for (int i = 0; i < sizeArray; i++) {
            numberArray[i] = random.nextInt(100);
        }
        return numberArray;
    }
    

}