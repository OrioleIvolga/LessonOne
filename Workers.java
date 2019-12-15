package ru.geekbrains.java_one.lesson_a.homework;

import java.util.Random;

public class Workers {
        private String name;
        private String position;
        private String phone;
        private int salary;
        private int birthDay;
        //private final int uuid;

        /*private static int generateUuid (int uuid) {
            Random random = new Random();
            return random.nextInt(uuid);
        }*/

    public Workers (String name, String position, String phone, int salary, int birthDay) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthDay = birthDay;
        //this.uuid = generateUuid();
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setSalary() {
        this.salary = salary + 5000;
    }

    /*public int getUuid() {
        return uuid;
    }*/

}
