public class Main{
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(0,1);
        fib.setFibNumbers(40);
        fib.PrintFibAtIndex(6);
        fib.PrintFibAtIndex(19);
        fib.PrintFibAtIndex(28);
        fib.PrintFibAtIndex(36);
        fib.PrintFibAtIndex(38);
    }
}