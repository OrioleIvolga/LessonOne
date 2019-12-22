package ru.geekbrains.java_one.lesson_a.homework;

import java.io.*;

public class TextWork {
    public static void main(String[] args) {
        String str1 = "Glokaya kuzdra bodlanula bokra i seychas kurdyachit bokrenka";
        String str2 = "S tochki zreniya dedukcii, indukcii i mozgovoj produkcii vy" +
                " nekompetentny v etom voprose, poskolku kazhdyj pessimisticheski nastroennyj individuum" +
                " katastroficheski modificiruet abstrakcii realnogo subbektivizma";
    try {
        FileOutputStream fis = new FileOutputStream("primary1.txt", true);
        fis.write(str1.getBytes());
        fis.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try {
        FileOutputStream fis = new FileOutputStream("primary2.txt", true);
        fis.write(str2.getBytes());
        fis.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    }
}
