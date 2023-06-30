public class Formatter {

    private final float sum;

    public Formatter(float sum) {
        this.sum = sum;
    }

    public String getFormattedString() {
        int i = (int) sum;

        String messageTemplate = "%.2f %s";
        if (i < 2) {
            return String.format(messageTemplate, this.sum, "рубль");
        } else if (i < 5) {
            return String.format(messageTemplate, this.sum, "рубля");
        } else {
            return String.format(messageTemplate, this.sum, "рублей");
        }
    }


}
