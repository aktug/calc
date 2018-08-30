public class Calculator {

    private int value;

    public int getValue() {
        return value;
    }

    public Calculator(String exp) {

        int opPos = -1;
        String operator = "";
        if (exp.contains("+")) {
            opPos = exp.indexOf("+");
            operator = "+";
        }
        if (exp.contains("-")) {
            opPos = exp.indexOf("-");
            operator = "-";
        }
        if (exp.contains("/")) {
            opPos = exp.indexOf("/");
            operator = "/";
        }
        if (exp.contains("*")) {
            opPos = exp.indexOf("*");
            operator = "*";
        }

        int int1 = Integer.parseInt(exp.substring(0, opPos));
        int int2 = Integer.parseInt(exp.substring(opPos + 1));

        this.value = this.Calculator(int1, int2, operator);
    }

    private int Calculator(int int1, int int2, String operator) {

        Math math = new Math();
        switch (operator) {
            case "+":
                return math.add(int1, int2);
            case "-":
                return math.sub(int1, int2);
            case "/":
                return math.div(int1, int2);
            case "*":
                return math.mult(int1, int2);
            default:
                return 0;
        }
    }
}
