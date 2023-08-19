public class ExpressionSolver {
    private String expression;
    private int position;
    private String plus;
    private String minus;
    private String multiple;
    private String divide;
    public ExpressionSolver(String input){
        expression = input;
        position= 0;
        plus = "+";
        minus = "-";
        multiple = "*";
        divide = "/";
        for (int i = 0; i<expression.length();i++){
            if (expression.substring(i,i+1).equals(" ")){
                expression = expression.substring(0,i)+expression.substring(i+1);
                i--;
            }
        }
    }
    public int solve() {
        // Split the expression into parts based on addition and subtraction operators
        String[] parts = expression.split("[\\+\\-]");
    
        int result = 0; // Initialize the result
    
        for (String part : parts) {
            // Split each part based on multiplication and division operators
            String[] subParts = part.split("[\\*/]");
    
            int subResult = Integer.parseInt(subParts[0]); // Initialize subResult with the first number
    
            for (int i = 1; i < subParts.length; i += 2) {
                // Apply the appropriate operator to subResult based on the odd-indexed elements
                int nextValue = Integer.parseInt(subParts[i + 1]);
                if (subParts[i].equals("*")) {
                    subResult *= nextValue;
                } else if (subParts[i].equals("/")) {
                    if (nextValue == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    subResult /= nextValue;
                }
            }
    
            // Add or subtract subResult to/from the result based on the operator in the original part
            if (expression.indexOf(part) == 0 || expression.charAt(expression.indexOf(part) - 1) == '+') {
                result += subResult;
            } else {
                result -= subResult;
            }
        }
    
        return result;
    }
    
    // finds first instance 
    public int findFirst(String a, String b) {
        int firstA = expression.indexOf(a);
        int firstB = expression.indexOf(b);
        if (firstA > -1 && firstA < firstB) {
            return firstA;
        }
        if (firstB > -1 && firstB < firstA) {
            return firstB;
        }
        if (firstA > -1) {
            return firstA;
        }
        if (firstB > -1) {
            return firstB;
        }
        return -1;
    }

    //find ths int from before the operator
    public int findIntBefore(String str){
        String last = str.substring(lastOperator(str));
        return Integer.parseInt(last);
    }
    //finds the int from after the operator
    public int findIntAfter(String str){
        String first = str.substring(0,firstOperator(str));
        return Integer.parseInt(first);
    }
    //finds the last operator in a string
    public int lastOperator(String str){
        int indexOfmin = str.indexOf(minus);
        int indexOfmulti = str.indexOf(multiple);
        int indexOfadd = str.indexOf(plus);
        int indexOfdiv = str.indexOf(divide);
        return Math.max(Math.max(indexOfmin,Math.max(indexOfmulti,indexOfadd)),indexOfdiv);
    }
    //finds the first operator in a string
    public int firstOperator(String str){
        int indexOfmin = str.indexOf(minus);
        int indexOfmulti = str.indexOf(multiple);
        int indexOfadd = str.indexOf(plus);
        int indexOfdiv = str.indexOf(divide);
        return Math.min(Math.min(indexOfmin,Math.min(indexOfmulti,indexOfadd)),indexOfdiv);
    }
}
