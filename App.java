import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //ExpressionSolverRunner ();
        //myFrameKey frame = new myFrameKey();
        myMouseTest test = new myMouseTest();
    }
    public static void HistogramRunner(){
        Scanner kbd = new Scanner(System.in);
        Histogram test = new Histogram();
        String input = kbd.nextLine();
        test.run(input);
        System.out.println(test.toString());
    }
    public static void ExpressionSolverRunner(){
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();
        ExpressionSolver solve = new ExpressionSolver(input);
        System.out.println(solve.test());
    }
    public static void FibonacciRunner(){
        Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();
        Fibonacci fibo = new Fibonacci(input);
        fibo.fill();
        String result = fibo.answer();
        System.out.println(result);
    }
    public static void Spiral(){
        Scanner kbd = new Scanner(System.in);
        int input = kbd.nextInt();
        SpiralMatrix spira = new SpiralMatrix(input);
        spira.fill();
        System.out.println(spira);
    }
}
