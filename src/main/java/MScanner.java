import java.util.Scanner;

public class MScanner {
    boolean isNumber = false;
    int peopleCount;
    Scanner scanner;
    Calculator calculator;
    String complete;
    public MScanner(Calculator calculator) {
        scanner = new Scanner(System.in);
        this.calculator = calculator;
    }

    void setPeopleCount() {
        System.out.println("На скольких человек необходимо разделить счёт? \nВведите значение:");
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
    }

    void setPrice() {
        do {
            System.out.println("Введите название товара.");
            String name = scanner.next();
            System.out.println("Введите стоимость товара.");
            float price = 0;
            boolean isFloat = false;
            do {
                if (scanner.hasNextFloat()){
                    price = scanner.nextFloat();
                    isFloat = true;
                } else {
                    System.out.println("Не верный формат ввода. Введите в формате рубли,копейки, например 10,45");
                    scanner = new Scanner(System.in);
                }

            } while (!isFloat);

            Product product = new Product(name, price);
            calculator.addProduct(product);
            System.out.println("Введите любой символ что бы продолжить или введите \"Завершить\" что бы ЗАВЕРШИТЬ");
            complete = scanner.next();
        } while (!complete.equalsIgnoreCase("Завершить"));
    }

    int getPeopleCount() {
        return peopleCount;
    }
}
