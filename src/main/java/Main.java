import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("На скольких человек необходимо разделить счёт? \nВведите значение:");
        Scanner scanner = new Scanner(System.in);
        String complete;
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
                System.out.println("Это некорректное значение для подсчёта. Введите число");
                scanner = new Scanner(System.in);
            }
        }

        Calculator calculator = new Calculator();
        calculator.showRequest();
        do {
            System.out.println("Введите название товара.");
            String name = scanner.next();
            System.out.println("Введите стоимость товара.");
            float price = scanner.nextFloat();
            Product product = new Product(name, price);
            calculator.addProduct(product);
            System.out.println("Введите любой символ что бы продолжить или введите \"Завершить\" что бы ЗАВЕРШИТЬ");
            complete = scanner.next();
        } while (!complete.equalsIgnoreCase("Завершить"));

        float endPrice = calculator.sum / peopleCount;
        Formatter formatter = new Formatter(endPrice);

        System.out.println("Добавленные товары:\n" + calculator.result + " \nСумма: "+ formatter.getFormattedString());

    }
}