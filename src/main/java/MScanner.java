import java.util.Scanner;

public class MScanner {
    private int peopleCount;
    private Scanner scanner;
    private final Calculator calculator;

    public MScanner(Calculator calculator) {
        scanner = new Scanner(System.in);
        this.calculator = calculator;
    }

    public void setPeopleCount() {
        System.out.println("На скольких человек необходимо разделить счёт? \nВведите значение:");
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
    }

    public void setPrice() {
        String complete;
        do {
            System.out.println("Введите название товара.");
            String name = scanner.next();
            System.out.println("Введите стоимость товара.");
            float price = getPrice();
            Product product = new Product(name, price);
            calculator.addProduct(product);
            System.out.println("Введите любой символ что бы продолжить или введите \"Завершить\" что бы ЗАВЕРШИТЬ");
            complete = scanner.next();
        } while (!complete.equalsIgnoreCase("Завершить"));
    }

    private float getPrice() {
        float price = 0;
        boolean isFloat = false;
        do {
            if (scanner.hasNextFloat()){
                price = scanner.nextFloat();
                if(price <= 0) {
                    System.out.println("Стоимость не может быть отрицательной или нулевой. Введите стоимость заново.");
                    scanner = new Scanner(System.in);
                } else {
                    isFloat = true;
                }
            } else {
                System.out.println("Не верный формат ввода. Введите в формате рубли,копейки, например 10,45");
                scanner = new Scanner(System.in);
            }
        } while (!isFloat);

        return price;
    }

    public int getPeopleCount() {
        return peopleCount;
    }
}
