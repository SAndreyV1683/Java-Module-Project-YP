public class Calculator {
    private String result = "";
    private float sum;
    public String getResult() {
        return result;
    }

    public float getSum() {
        return sum;
    }

    public void showRequest() {
        System.out.println("Введите название товара и его стоимость.\nСтоимость должна быть в формате \"рубли,копейки\", например 10,45 или 11,40");
    }

    public void addProduct(Product product) {
        result += product.getName() + "\n";
        calculate(product);
    }

    public void calculate(Product product) {
        sum += product.getPrice();
    }

}
