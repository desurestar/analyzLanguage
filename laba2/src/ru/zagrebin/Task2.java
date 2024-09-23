package ru.zagrebin;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task2 {
    /*public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int elem : array) {
            set.add(elem);
        }

        int[] resultArray = new int[set.size()];
        int i = 0;
        for (int elem : set) {
            resultArray[i++] = elem;
        }

        return resultArray;
    }*/
    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);

        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if ( array[i] != array[i+1] ) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length-1];

        int[] result = new int[j];

        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static int[] getFirst(int[] array, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static int[] getLast(int[] array, int n) {
        int[] result = new int[n];
        int j = 0;
        for (int i = array.length - n; i < array.length ; i++) {
            result[j++] = array[i];
        }

        return result;
    }

    public static int countIdentic(int[] array) {
        Arrays.sort(array);

        int cnt = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) cnt++;
        }

        return cnt;
    }
}
