package tasks;

import helpers.Helpers;

import java.util.Scanner;

public class Task3Extended {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        if (size == 0) {
            System.out.println("Введите длину массива: ");
            size = input.nextInt();
        }
        int array[] = new int[size];

        System.out.println("Введите " + size + Helpers.getNumber(size) + " через пробел:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Числа кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        input.close();
    }


}