package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] arr = new Employee[10];
        for (int i = 0; i < arr.length; i++) {
                arr[0] = new Employee("Иванов Никита Юрьевич", 2, 130000);
                arr[1] = new Employee("Сладкова Лариса Александровна", 1, 330000);
                arr[2] = new Employee("Ваткин Илья Сергеевич", 2, 75000);
                arr[3] = new Employee("Кротких Максим Павлович", 4, 1670070);
                arr[4] = new Employee("Гладких Яна Борисовна", 3, 166220);
                arr[5] = new Employee("Мешкова Дарья Максимовна", 5, 1390801);
                arr[6] = new Employee("Журавлев Виталий Анатольевич", 4, 178899);
                arr[7] = new Employee("Щупов Валерий Владимирович", 2, 1238900);
                arr[8] = new Employee("Мягкая Кристина Юрьевна", 5, 129000);
                arr[9] = new Employee("Первая Виктория Алексеевна", 1, 213000);
                System.out.println(arr[i].toString());
        } System.out.println(arr[0].getZp() + arr[1].getZp() + arr[2].getZp() + arr[3].getZp() + arr[4].getZp() + arr[5].getZp() + arr[6].getZp() + arr[7].getZp() + arr[8].getZp() + arr[9].getZp());
    }
    //Вывести информацию о сотрудниках
    public static void informationEmployees(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        }

    //Сумма затрат на месяц
    public static void zpAll(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getZp());
        }
    }

}

