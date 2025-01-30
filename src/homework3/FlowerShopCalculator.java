package homework3;

import java.util.Scanner;

public class FlowerShopCalculator {
    public static void main(String[] args) {
        System.out.println("Введіть кількість квітів, яку ви хочете купити");
        Scanner scan = new Scanner(System.in);
        int flowers = scan.nextInt();
        System.out.println("Введіть ціну за одиницю квітки");
        int price = scan.nextInt();
        System.out.println("Загальна сума яку ви повинні заплатити: " + flowers * price);
        scan.close();
    }
}
