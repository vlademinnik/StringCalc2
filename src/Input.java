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
        if (values[0].length() > 10 || values[1].length() > 10) {
            throw new IOException("Вводимая строка не должна быть больше 10 символов");
        }
    return result;
    }
}
