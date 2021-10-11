public class Parser {
    public static String[] getValues(String x){
        String[] operands = x.split("[+/*-]");
        return operands;
    }
    public static String getOperator(String x){
        return x.replaceAll("[\"a-zA-Z0-9!@#$%^&()?]",  "").trim();
    }
}
