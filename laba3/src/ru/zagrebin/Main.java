package ru.zagrebin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\klows\\OneDrive\\Документы\\analyz\\analyzLanguage\\laba3\\src\\ru\\zagrebin\\file.txt";
        ArrayList<Military> militarys = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            ArrayList<String> atrb= new ArrayList<>();
            while ((line = br.readLine()) != null) {
                atrb.add(line);
                if (line.isEmpty()) {
                    militarys.add(new Military(atrb.get(0), atrb.get(1),atrb.get(2), atrb.get(3), atrb.get(4), atrb.get(5), atrb.get(6), atrb.get(7)));
                    atrb.clear();

                }
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        String path2 = "C:\\Users\\klows\\OneDrive\\Документы\\analyz\\analyzLanguage\\laba3\\src\\ru\\zagrebin\\new_file.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
            for (Military mil : militarys) {
                if (mil.getRank().equals("лейтенант")) {
                    System.out.println(mil);
                    bw.write(mil.toString());
                    bw.newLine();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }
}