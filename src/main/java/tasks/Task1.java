package tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer number = sc.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Попробуйте еще раз");
        }
        sc.close();
    }
}

