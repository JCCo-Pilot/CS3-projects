import java.lang.reflect.Array;
import java.util.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
public class ExpressionSolver {
    private String[] expression;
    private String clonexpress;
    private ArrayList<String>exp;
    //private String plus;
    //private String minus;
    //private String multiple;
    //private String divide;
    public ExpressionSolver(String input){
        expression = input.split(" ");
        clonexpress = input;
        exp = new ArrayList<String>(Arrays.asList(expression));
    }

    public int solve() {
        for(int i = 0; i < exp.size(); i++) {
            if(exp.get(i).equals("*") || exp.get(i).equals("/")) {
                if(exp.get(i).equals("*")) {
                    int t = Integer.parseInt(exp.get(i-1)) * Integer.parseInt(exp.get(i+1));
                    exp.remove(i+1);
                    exp.remove(i-1);
                    exp.set(i-1, t+"");
                } else if(exp.get(i).equals("/")) {
                    int t = Integer.parseInt(exp.get(i-1)) / Integer.parseInt(exp.get(i+1));
                    exp.remove(i+1);
                    exp.remove(i-1);
                    exp.set(i-1, t+"");
                }
                i--;
            }
        }
        for(int i = 0; i < exp.size(); i++) {
            if(exp.get(i).equals("+") || exp.get(i).equals("-")) {
                if(exp.get(i).equals("+")) {
                    int t = Integer.parseInt(exp.get(i-1)) + Integer.parseInt(exp.get(i+1));
                    exp.remove(i+1);
                    exp.remove(i-1);
                    exp.set(i-1, t+"");
                } else if(exp.get(i).equals("-")) {
                    int t = Integer.parseInt(exp.get(i-1)) - Integer.parseInt(exp.get(i+1));
                    exp.remove(i+1);
                    exp.remove(i-1);
                    exp.set(i-1, t+"");
                }
                i--;
            }
        }
        return Integer.parseInt(exp.get(0));
    }
    /*public int test(){
        int result = Integer.parseInt(expression[0]);
        for (int i = 1;i<expression.length;i++){
            if (expression[i].equals(multiple)){
                for (int a = i; a<expression.length;a++){
                    if (isntOperator(expression[a])){
                        if (isOperator(expression[a])){
                            break;
                        }
                        result *= Integer.parseInt(expression[a]);
                    }
                }
            }
            if (expression[i].equals(divide)){
                for (int a = i; a<expression.length;a++){
                    if (isntOperator(expression[a])){
                        if (isOperator(expression[a])){
                            break;
                        }
                        result /= Integer.parseInt(expression[a]);
                    }
                }
            }
        }
        for (int i = 1;i<expression.length;i++){
            if (expression[i].equals(minus)){
                for (int a = i; a<expression.length;a++){
                    if (isntOperator(expression[a])){
                        if (isOperator(expression[a])){
                            break;
                        }
                        result -= Integer.parseInt(expression[a]);
                    }
                }
            }
            if (expression[i].equals(plus)){
                for (int a = i; a<expression.length;a++){
                    if (isntOperator(expression[a])){
                        if (isOperator(expression[a])){
                            break;
                        }
                        result += Integer.parseInt(expression[a]);
                    }
                }
            }
        }
        return result;
    }
    public String solve(String str) {
        return clonexpress+" = "+evalute();
    }
    public int evalute(){
        return test();   
    }
    public boolean isOperator(String str){
        if (str.equals(minus)){
            return true;
        }
        if (str.equals(divide)){
            return true;
        }
        if (str.equals(multiple)){
            return true;
        }
        if (str.equals(plus)){
            return true;
        }
        return false;
    }
    public boolean isntOperator(String str){
        if (str.equals(minus)){
            return false;
        }
        if (str.equals(divide)){
            return false;
        }
        if (str.equals(multiple)){
            return false;
        }
        if (str.equals(plus)){
            return false;
        }
        if (str.equals("")){
            return false;
        }
        return true;
    }*/
    /*public int solve() {
        // Split the expression into parts based on addition and subtraction operators
        String[] parts = expression.split("[\\+\\-]");
    
        int result = 0; // Initialize the result
    
        for (String part : parts) {
            // Split each part based on multiplication and division operators
            String[] subParts = part.split("[\\]");
    
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
    }*/
    // finds first instance 
    /*public int findFirst(String a, String b) {
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
    }*/
    //find ths int from before the operator
    /*public int findIntBefore(String str){
        String last = str.substring(lastOperator(str));
        return Integer.parseInt(last);
    }
    //finds the int from after the operator
    public int findIntAfter(String str){
        String first = str.substring(0,firstOperator(str));
        return Integer.parseInt(first);
    }*/
    //finds the last operator in a string
    /*public int lastOperator(String str){
        int indexOfmin = str.indexOf(minus);
        int indexOfmulti = str.indexOf(multiple);
        int indexOfadd = str.indexOf(plus);
        int indexOfdiv = str.indexOf(divide);
        return Math.max(Math.max(indexOfmin,Math.max(indexOfmulti,indexOfadd)),indexOfdiv);
    }*/
    //finds the first operator in a string
    /*public int firstOperator(String str){
        int indexOfmin = str.indexOf(minus);
        int indexOfmulti = str.indexOf(multiple);
        int indexOfadd = str.indexOf(plus);
        int indexOfdiv = str.indexOf(divide);
        return Math.min(Math.min(indexOfmin,Math.min(indexOfmulti,indexOfadd)),indexOfdiv);
    }*/
}
