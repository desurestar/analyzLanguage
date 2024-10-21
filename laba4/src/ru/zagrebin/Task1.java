package ru.zagrebin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void start (){
        ArrayList<Integer> arrList = generateArrayList(1000000);
        LinkedList<Integer> arrLinked= generateLinkedList(1000000);

        long time = System.currentTimeMillis();
        selectRandomElementInArrayList(arrList, 100000);
        System.out.printf("Время перебора ArrayList: %d\n", System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        selectRandomElementInLinkedList(arrLinked, 100000);
        System.out.printf("Время перебора LinkedList: %d\n", System.currentTimeMillis() - time);

    }

    public static ArrayList<Integer> generateArrayList(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arrList.add(rand.nextInt(10000));
        }
        return arrList;
    }

    public static LinkedList<Integer> generateLinkedList(int n) {
        LinkedList<Integer> arrLinked = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arrLinked.add(rand.nextInt(10000));
        }
        return arrLinked;
    }

    public static void selectRandomElementInArrayList(ArrayList<Integer> arrayList, int n) {
        Random rand = new Random();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = arrayList.get(rand.nextInt(arrayList.size()));
        }
    }

    public static void selectRandomElementInLinkedList(LinkedList<Integer> arrayList, int n) {
        Random rand = new Random();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = arrayList.get(rand.nextInt(arrayList.size()));
        }
    }
}
