import java.math.BigInteger;
import java.util.ArrayList;

public class DeletablePrimes{
    private static int CERTAINTY = 10;
    BigInteger[][] nums;
    String numString;
    int counter;

    public DeletablePrimes(BigInteger num){
        counter = 0;
        numString = num.toString();
        nums = new BigInteger[numString.length()][];
        nums[0] = new BigInteger[]{num};
    }
    public DeletablePrimes(String numAsString){
        BigInteger num = new BigInteger(numAsString);
        counter = 0;
        numString = num.toString();
        nums = new BigInteger[numString.length()][];
        nums[0] = new BigInteger[]{num};
    }

    public void Run(){
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Solve(nums[i-1]);
        }
        System.out.println(counter);
    }

    public static boolean CheckIfPrime(BigInteger num){
        return num.isProbablePrime(CERTAINTY);
    }

    private BigInteger[] Solve(BigInteger[] nums){
        ArrayList<BigInteger> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String tmpString = nums[i].toString();
            StringBuilder builder = new StringBuilder(tmpString);
            for (int j = 0; j < tmpString.length(); j++) {
                StringBuilder buildertmp = new StringBuilder(builder);
                BigInteger tmpBI = new BigInteger(buildertmp.deleteCharAt(j).toString());
                if(CheckIfPrime(tmpBI)){
                    tmp.add(tmpBI); 
                    if(tmpBI.intValue()<10 && tmpBI.intValue() > 1 ) this.counter++;
                } 
            }
        }
        return tmp.toArray(new BigInteger[tmp.size()]);
    }
}