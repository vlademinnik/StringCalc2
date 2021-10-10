import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static String input() throws IOException {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine().replaceAll(" ", "");
        String[] values = Parser.getValues(result);

        if (values.length < 2) {
            throw new IOException("строка не является математической операцией");
        }
        if (values.length > 2) {
            throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
//        if (Integer.parseInt(values[1]) > 10 || Integer.parseInt(values[1]) <=0) {
//            throw new IOException("Число должно быть меньше или равно 10 и больше 0");
    return result;
    }
}
