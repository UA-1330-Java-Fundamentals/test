package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість квітів, яку ви хочете купити");
        int flowers = scan.nextInt();
        System.out.println("Введіть ціну за одиницю квітки");
        int price = scan.nextInt();
        System.out.println("Загальна сума яку ви повинні заплатити: " + flowers * price);
        scan.close();
    }
}
