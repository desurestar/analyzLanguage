package ru.zagrebin;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Task3 {

    public static void start() {

        while(true) {
            ArrayList<Student> students = new ArrayList<>();
            ArrayList<Student> studentsToAdd = new ArrayList<>();
            String path = "C:\\Users\\klows\\OneDrive\\Документы\\analyz\\analyzLanguage\\laba4\\src\\ru\\zagrebin\\stud.txt";
            String[] subjects = {"Mathematics", "Programming", "Physics", "Economics", "History", "Computer", "English", "Software Design"};
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String res;
                while ((res = br.readLine()) != null) {
                    String[] line = res.split(" ");
                    if (line.length == 5)
                        students.add(new Student(line[0], line[1], line[2], Integer.parseInt(line[3]), line[4], subjects));
                    else if (line.length == 4)
                        students.add(new Student(line[0], line[1], line[2], Integer.parseInt(line[3]), subjects));
                    else {
                        System.out.println("Error line");
                        break;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите команду");
            String line = scanner.nextLine();

            if (line.equals("LIST")) {
                for (Student student : students)
                    System.out.println(student);
            } else if (line.contains(" ")) {
                List<String> student = new ArrayList<>();

                Collections.addAll(student, line.split(" "));
                boolean flag = true;
                for (Student std : students) {
                    if (std.getName().equals(student.get(0)) && std.getSurname().equals(student.get(1))) {
                        System.out.println(std.getEmail());
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Введите группу студента: ");
                    student.add(scanner.nextLine());
                    System.out.println("Введите курс студента: ");
                    student.add(scanner.nextLine());
                    System.out.println("Введите email студента: ");
                    student.add(scanner.nextLine());

                    students.add(new Student(student.get(0), student.get(1), student.get(2), Integer.parseInt(student.get(3)), student.get(4), subjects));
                }
            } else {
                List<String> student = new ArrayList<>();
                boolean flag = true;

                for (Student std : students) {
                    if (std.getEmail().equals(line)) {
                        System.out.printf("%s %s\n", std.getName(), std.getSurname());
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("Введите имя студента: ");
                    student.add(scanner.nextLine());
                    System.out.println("Введите фамилию студента: ");
                    student.add(scanner.nextLine());
                    System.out.println("Введите группу студента: ");
                    student.add(scanner.nextLine());
                    System.out.println("Введите курс студента: ");
                    student.add(scanner.nextLine());

                    students.add(new Student(student.get(0), student.get(1), student.get(2), Integer.parseInt(student.get(3)), line, subjects));
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

                    for (Student student : students) {
                        bw.write(student.toWrite());
                    }


            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
