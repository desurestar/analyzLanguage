package ru.zagrebin;

import java.util.ArrayList;

public class Student {
    String name;
    String surname;
    String group;
    String email;
    int course;
    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String name, String group, int course, String[] subjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        createListSubjects(subjects);
    }

    public Student(String name, String surname, String group, int course, String email, String[] subjects) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.course = course;
        this.email = email;
        createListSubjects(subjects);
    }
    public Student(String name, String surname, String group, int course, String[] subjects) {
        this.name = name;
        this.surname = surname;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name != null ? name.equals(student.getName()) : student.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        if (email == null) return String.format("""
                                                Name: %s
                                                Group: %s
                                                Course: %d
                                                """, this.name, this.group, this.course);
        else               return String.format("""
                                                Name: %s
                                                Group: %s
                                                Course: %d
                                                Email: %s
                                                """, this.name, this.group, this.course, this.email);
    }

    public String toWrite() {
        return String.format("%s %s %s %d %s\n", this.name, this.surname, this.group, this.course, this.email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
