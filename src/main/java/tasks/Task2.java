package tasks;

import java.util.Scanner;

public class Task2 extends DataBase {

    public static void main(String[] args) {


        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals(nameInBase)) {
            System.out.println("Привет, " + name);
        } else if (name.equals(nameInBase.toLowerCase())) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
        sc.close();
    }
}

