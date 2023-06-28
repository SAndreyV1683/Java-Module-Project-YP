public class Formatter {

    float sum;
    String messageTemplate = "%.2f %s";

    public Formatter(float sum) {
        this.sum = sum;
    }

    String getFormattedString() {
        int i = (int) sum;

        if (i < 2) {
            return String.format(messageTemplate, this.sum, "рубль");
        } else if (i < 5) {
            return String.format(messageTemplate, this.sum, "рубля");
        } else {
            return String.format(messageTemplate, this.sum, "рублей");
        }
    }


}
