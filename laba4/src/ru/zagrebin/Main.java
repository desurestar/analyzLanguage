package ru.zagrebin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main (String[] args){
//        Task1.start();
        String path = "C:\\Users\\klows\\OneDrive\\Документы\\analyz\\analyzLanguage\\laba4\\src\\ru\\zagrebin\\file.txt";
        String[] subjects = {"Mathematics", "Programming", "Physics", "Economics", "History", "Computer", "English", "Software Design"};
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String res;
            while ((res = br.readLine()) != null) {
                String[] line = res.split(", ");
                students.add(new Student(line[0], line[1], Integer.parseInt(line[2]), subjects));
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }



        System.out.println(expel(students));
        System.out.println(transfer(students));
        List<Student> res = getStudents(students, 3);

        for (Student student : res) {
            System.out.println(student);
        }

    }

    static int expel(List<Student> students) {
        int cnt = 0;
        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageMarkInSubject() < 3) {
                iterator.remove();
                cnt++;
            }
        }
        return cnt;
    }

    static int transfer(List<Student> students) {
        int cnt = 0;
        for (Student student : students) {
            if (student.averageMarkInSubject() >= 3) {
                student.course += 1;
                cnt++;
            }
        }
        return cnt;
    }

    static List<Student> getStudents(List<Student> students, int course) {
        List<Student> temp = new ArrayList<>();
        for (Student student : students) {
            if (student.course == course) {
                temp.add(student);

            }
        }
        return temp;
    }


}