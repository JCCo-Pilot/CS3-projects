public class ExpressionSolver {
    private String expression;
    private int position;
    public ExpressionSolver(String input){
        expression = input;
        position= 0;
    }
    public int solve(){
        int index=expression.indexOf(" ");
        int result = 1;
        // removed all the space
        while(index>-1){
            expression = expression.substring(0,index)+expression.substring(index+1);
        }
        while (expression.indexOf("*")>-1||expression.indexOf("/")>-1){
            
        }
    }
    public int findFirst(String a, String b){
        int firstA = expression.indexOf(a);
        int firstB = expression.indexOf(b);
        if(firstA>-1&&firstA<firstB){
            return firstA;
        }
        if (firstB>-1&&firstB<firstA){
            return firstB;
        }
        return -1;
    }
    
}
