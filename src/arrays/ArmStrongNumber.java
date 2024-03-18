package arrays;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

//Armstrong numbers are those whose sum of each digit raised to the
// power count of digits is equal to the number itself
public class ArmStrongNumber {
    public static int armStrong(int n){
        int count=(int) (log10(n)+1);
        System.out.println(count);
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum= (int) (sum+pow(ld,count));
            n=n/10;
        }
        return sum;
    }


    public static void main(String[] args) {

        int c=armStrong(1634);
        System.out.println(c);


    }
}
