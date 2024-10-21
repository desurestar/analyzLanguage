package ru.zagrebin;

import java.util.ArrayList;

public class Student {
    String name;
    String group;
    int course;
    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String name, String group, int course, String[] subjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        createListSubjects(subjects);
    }

    void createListSubjects(String[] subs) {
        for (String elem : subs) {
            subjects.add(new Subject(elem));
        }
    }

    int averageMarkInSubject() {
        int res = 0;
        for (Subject subject : subjects) {
            res += subject.averageMark();
        }
        res /= subjects.size();
        return res;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                Group: %s
                Course: %d
                """, this.name, this.group, this.course);
    }
}
