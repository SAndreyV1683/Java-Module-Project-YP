public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        MScanner mScanner = new MScanner(calculator);
        int peopleCount;

        mScanner.setPeopleCount();
        peopleCount = mScanner.getPeopleCount();
        calculator.showRequest();
        mScanner.setPrice();

        float endPrice = calculator.sum / peopleCount;
        Formatter formatter = new Formatter(endPrice);

        System.out.println("Добавленные товары:\n" + calculator.result + "Сумма, которую должен заплатить каждый поровну: "+ formatter.getFormattedString());
    }
}