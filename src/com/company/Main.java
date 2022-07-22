package com.company;

public class Main {
    public static void main(String[] args) {

        Famaly1 famaly1 = new Famaly1("Москва Сити", 2);
        System.out.println("Семья Ивановы:");
        System.out.println(famaly1);
        famaly1.lives();
        famaly1.pay();

        System.out.println("---------------------");

        Famaly2 famaly2 = new Famaly2("Бишкек Сити", 4);
        System.out.println("Семья Кожорбековы:");
        System.out.println(famaly2);
        famaly2.lives();
        famaly2.pay();

        System.out.println("---------------------");

        Famaly3 famaly3 = new Famaly3("Нью Йорк Сити", 3);
        System.out.println("Семья Джонсон:");
        System.out.println(famaly3);
        famaly3.lives();
        famaly3.pay();

    }
}