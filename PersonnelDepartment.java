package ru.geekbrains.java_one.lesson_a.homework;
/*
1.	Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
2.	Конструктор класса должен заполнять эти поля при создании объекта;
3.	Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
4.	Вывести при помощи методов из пункта 3 ФИО и должность.
5.	Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
6.	* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
7.  *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер

    * */

import java.util.ArrayList;

public class PersonnelDepartment {

    public static void main(String[] args) {
        ArrayList workers = new ArrayList();

        Workers w0 = new Workers("Иванов Иван Иванович", "начальник кошачьего отдела", "+74951111111", 100000, 1970);
        Workers w1 = new Workers("Громогласный Зевс Иерихонович", "кормилец котов", "+74952222222", 50000, 1980);
        Workers w2 = new Workers("Чингачгук Роман Аронович", "главный специалист", "+74951111111", 10000, 1990);
        Workers w3 = new Workers("Груша Глафира Семеновна", "ведущий специалист", "+74951111111", 5000, 1970);
        Workers w4 = new Workers("Петров Иван Дмитриевич", "ведущий специалист", "+74951111111", 5000, 1960);

        workers.add(w0);
        workers.add(w1);
        workers.add(w2);
        workers.add(w3);
        workers.add(w4);

        System.out.println("Количество сотрудников " + workers.size());
        for (Object workerObj : workers.toArray()) {
            Workers worker = (Workers) workerObj;
            System.out.println(worker.getName() + " " + worker.getPosition());
        }

        System.out.println();

        System.out.println("Сотрудники старше 40 лет");

        for (Object workerObj : workers.toArray()) {
            Workers worker = (Workers) workerObj;
            worker.getBirthDay();
            if (2019 - worker.getBirthDay() > 40) {
                System.out.println(worker.getName() + " " + worker.getPosition());
            }
        }

        for (Object workerObj : workers.toArray()) {
            Workers worker = (Workers) workerObj;
            worker.getBirthDay();
            if (2019 - worker.getBirthDay() > 45) {
                worker.setSalary();
                System.out.println(worker.getName() + " " + worker.getPosition() + " " + worker.getSalary());
            }
        }
    }
}