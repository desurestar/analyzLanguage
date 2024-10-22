package ru.zagrebin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Task2 {

    public static void start (){

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


        Set<Student> st1 = new HashSet<>();
        Set<Student> st2 = new HashSet<>();
        st1.add(new Student("Artem", "pin-122", 3, subjects));
        st1.add(new Student("Oleg", "pin-122", 3, subjects));
        st1.add(new Student("Ruslan", "pin-122", 3, subjects));

        st2.add(new Student("Ruslan", "pin-122", 3, subjects));
        st2.add(new Student("Kate", "pin-122", 3, subjects));
        st2.add(new Student("Egor", "pin-122", 3, subjects));

        Set<Student> union = union(st1, st2);
        Set<Student> intersection = intersect(st1, st2);

        System.out.println("Круги Эйлера\n\n\n\n\n");
        System.out.println("union");
        for (Student student : union) {
            System.out.println(student);
        }
        System.out.println("intersection");
        System.out.println(intersection.size());
        for (Student student : intersection) {
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

    public static Set<Student> union(Set<Student> set1, Set<Student> set2) {
        Set<Student> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }


    public static Set<Student> intersect(Set<Student> set1, Set<Student> set2) {
        Set<Student> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

}
