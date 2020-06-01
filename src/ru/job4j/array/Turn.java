package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int startIndex = 0; startIndex < array.length / 2; startIndex++) {
            int tmp = array[startIndex];
            int finishIndex = array.length - 1 - startIndex;
            array[startIndex] = array[finishIndex];
            array[finishIndex] = tmp;
        }
        return array;
    }
}