package ru.zagrebin;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path = "file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                while (line != "\n") {

                }
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}