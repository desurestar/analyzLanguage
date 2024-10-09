package ru.zagrebin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Military {
    // Поля класса
    private String lastName;    // Фамилия
    private String firstName;   // Имя
    private String middleName;  // Отчество
//    почтовый индекс,
//            страна, область, район, город, улица, дом, квартира
    private Map<String, String> address = new HashMap<>();     // Адрес
    private String nationality; // Национальность
    private String dateOfBirth; // Дата рождения (в формате ГГГГ-ММ-ДД)
    private String position;    // Должность
    private String rank;        // Звание

    // Конструктор для инициализации объекта
    public Military(String lastName, String firstName, String middleName, String address,
                             String nationality, String dateOfBirth, String position, String rank) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = generateCorrectAddress(address);
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.rank = rank;
    }

    // Геттеры и сеттеры для доступа к полям

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    private Map<String, String> generateCorrectAddress(String adr) {
        String[] parts = adr.split(", ");
        int i = 0;
        if (parts.length >= 8) {
            address.put("Почтовый индекс", parts[0]);
            address.put("Страна", parts[1]);
            address.put("Область", parts[2]);
            address.put("Район", parts[3]);
            address.put("Город", parts[4]);
            address.put("Улица", parts[5]);
            address.put("Дом", parts[6]);
            address.put("Квартира", parts[7]);
        } else {
            System.out.println("Неверный формат адреса");
        }
        return address;
    }

    private String addressToString() {
        return String.join(", ", address.values());

    }

    // Метод для вывода информации о человеке
    public String toString() {
        return String.format("""
                Фамилия: %s
                Имя: %s
                Отчество: %s
                Адрес: %s
                Национальность: %s
                Дата рождения: %s
                Должность: %s
                Звание: %s
                """, lastName, firstName, middleName, addressToString(), nationality, dateOfBirth, position, rank);
    }
}

