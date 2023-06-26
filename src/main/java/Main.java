import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("На скольких человек необходимо разделить счёт? \nВведите значение:");
        Scanner scanner = new Scanner(System.in);
        int peopleCount = 0;
        boolean isNumber = false;

        while (!isNumber) {
            if (scanner.hasNextInt()) {
                peopleCount = scanner.nextInt();
                if (peopleCount < 1) {
                    System.out.println("Это некорректное значение для подсчёта. \nВведите значение заново.");
                    scanner = new Scanner(System.in);
                } else {
                    isNumber = true;
                }
            } else {
                System.out.println("Введите число");
                scanner = new Scanner(System.in);
            }
        }

        System.out.println("peopleCount " +  peopleCount);
    }
}