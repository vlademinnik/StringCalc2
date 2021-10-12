import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String result = Input.input();
        String[] values = Parser.getValues(result);
        String operator = Parser.getOperator(result);
        StringCalc str1 = new StringCalc(values,operator);
        StringBuilder str2 = new StringBuilder();
        System.out.println(str1.calculate());
    }
}
