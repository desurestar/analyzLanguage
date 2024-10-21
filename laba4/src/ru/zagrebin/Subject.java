package ru.zagrebin;

import java.util.ArrayList;
import java.util.Random;

public class Subject {

    public String title;
    public ArrayList<Integer> marks = new ArrayList<>();

    public Subject(String title) {
        this.title = title;
        randomMarks();
    }

    void randomMarks() {
        for(int i = 0; i < 5; i++) {
            marks.add(new Random().nextInt(2, 6));
        }
    }

    int averageMark() {
        int res = 0;
        for (int elem : marks) {
            res += elem;
        }
        res /= marks.size();
        return res;
    }
}
