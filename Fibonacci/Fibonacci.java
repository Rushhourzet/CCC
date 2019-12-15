public class Fibonacci{

    int i1;
    int i2;
    int[] fibs;
    public Fibonacci(int i1, int i2){
        this.i1 = i1;
        this.i2 = i2;
    }

    public void setFibNumbers(int numbers){
        fibs = new int[numbers];
        fibs[0] = i1;
        fibs[1] = i2;
        for(int i = 2; i<numbers; i++){
            fibs[i] = fibs[i-2] + fibs[i-1];
        }
    }
    public void PrintFib(int numbers){
        for(int i = 0; i<numbers;i++){
            System.out.println(fibs[i]);
        }
    }
    public void PrintFibAtIndex(int index){
        System.out.println(fibs[index]);
    }
}