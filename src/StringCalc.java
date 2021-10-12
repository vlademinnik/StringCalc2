import java.io.IOException;

public class StringCalc {
    public final String[] values;
    public final String operator;
    public String result;

    public StringCalc(String[] values, String operator) {
        this.operator = operator;
        this.values = values;
    }

    public String getResult() throws IOException {
        String a = values[0];
        String b = values[1];


        switch (operator) {

            case "+" -> result = plus(a, b);
            case "-" -> result = minus(a, b);
            case "*" -> {
                result = multiplication(a, b);
                if (Integer.parseInt(values[1]) > 10 || Integer.parseInt(values[1]) <= 0) {
                    throw new IOException("Число должно быть меньше или равно 10 и больше 0");
                }
            }
            case "/" -> {
                result = division(a, b);
                if (Integer.parseInt(values[1]) > 10 || Integer.parseInt(values[1]) <= 0) {
                    throw new IOException("Число должно быть меньше или равно 10 и больше 0");
                }
            }
        }
        if (result.length() > 40) {
            return result.substring(0, 40) + "..." + "\"";
        } else {
            return result;
        }
    }

    private String plus(String a, String b) {
        var ar = validate(a, b);
        return ("\"" + ar[0] + ar[1] + "\"");
    }

    private String minus(String a, String b) {
        var ar = validate(a, b);
        return ("\"" + ar[0].replaceAll(ar[1], "") + "\"");
    }

    private String multiplication(String a, String b) {
        var ar = validate(a, b);
        return ("\"" + ar[0].repeat(Integer.parseInt(ar[1])) + "\"");
    }

    private String division(String a, String b) {
        var ar = validate(a, b);
        return ("\"" + ar[0].substring(0, (a.length() / Integer.parseInt(ar[1]))) + "\"");
    }

    private String[] validate(String a, String b) {
        a = a.replaceAll("[\"]+", "");
        b = b.replaceAll("[\"]+", "");
        String[] ar = {a, b};
        return ar;
    }


    public String calculate() throws IOException {
        return getResult();
    }
}
