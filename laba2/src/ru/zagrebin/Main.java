package ru.zagrebin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random rand = new Random();
//        System.out.printf("Введите значение n: ");
//        int n = scanner.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[n];
//        int[] c = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = i;
//        }
//        for (int i = 0; i < n; i++) {
//            b[i] = new Random().nextInt(1, 101);
//        }
//        for (int i = 0; i < n; i++) {
//            c[i] = i;
//        }
//        for (int i = 0; i <= (int) n * 0.1; i++) {
//            c[i] = new Random().nextInt(1, 101);
//        }
//
//        long time = System.currentTimeMillis();
//        Sort.bubbleSort(a.clone());
//        System.out.printf("\nbubbleSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.bubbleSort(b.clone());
//        System.out.printf("bubbleSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.bubbleSort(c.clone());
//        System.out.printf("bubbleSort: %d\n", System.currentTimeMillis() - time);
//
//        time = System.currentTimeMillis();
//        Sort.insertionSort(a.clone());
//        System.out.printf("\ninsertionSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.insertionSort(b.clone());
//        System.out.printf("insertionSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.insertionSort(c.clone());
//        System.out.printf("insertionSort: %d\n", System.currentTimeMillis() - time);
//
//        time = System.currentTimeMillis();
//        Sort.selectionSort(a.clone());
//        System.out.printf("\nselectionSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.selectionSort(b.clone());
//        System.out.printf("selectionSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.selectionSort(c.clone());
//        System.out.printf("selectionSort: %d\n", System.currentTimeMillis() - time);
//
//        time = System.currentTimeMillis();
//        Sort.mergeSort(a.clone(), 0, a.clone().length-1);
//        System.out.printf("\nmergeSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.mergeSort(b.clone(), 0, b.clone().length-1);
//        System.out.printf("mergeSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.mergeSort(c.clone(), 0, c.clone().length-1);
//        System.out.printf("mergeSort: %d\n", System.currentTimeMillis() - time);
//
//        time = System.currentTimeMillis();
//        Sort.quickSort(a.clone());
//        System.out.printf("\nquickSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.quickSort(b.clone());
//        System.out.printf("quickSort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Sort.quickSort(c.clone());
//        System.out.printf("quickSort: %d\n", System.currentTimeMillis() - time);
//
//        time = System.currentTimeMillis();
//        Arrays.sort(a.clone());
//        System.out.printf("\nArrays.sort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Arrays.sort(b.clone());
//        System.out.printf("Arrays.sort: %d\n", System.currentTimeMillis() - time);
//        time = System.currentTimeMillis();
//        Arrays.sort(c.clone());
//        System.out.printf("Arrays.sort: %d\n", System.currentTimeMillis() - time);


        int[] array = new int[]{1, 1, 23, 32, 45, 23, 123, 552, 123, 6, 8, 3, 5, 21, 7, 784, 3, 56,};

        int[] a = Task2.removeDuplicates(array);

        for (int elem : a) {
            System.out.printf("%d ", elem);
        }
        System.out.printf("\n");

        int[] b = Task2.getFirst(array, 7);

        for (int elem : b) {
            System.out.printf("%d ", elem);
        }
        System.out.printf("\n");

        int[] c = Task2.getLast(array, 7);

        for (int elem : c) {
            System.out.printf("%d ", elem);
        }
        System.out.printf("\n");

        int cnt = Task2.countIdentic(array);
        System.out.printf("%d", cnt);
    }
}