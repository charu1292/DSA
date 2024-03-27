package arrays;

public class Alldivisors {
    public static void print_divisors(int n){
        for(int i=1;i<n;i++){
            if(n%i==0) {
                System.out.print(i + ",");
            }
        }
    }

    public static void main(String[] args) {
        int n =36;
        print_divisors(n);
    }
}
