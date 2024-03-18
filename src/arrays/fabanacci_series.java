package arrays;

public class fabanacci_series {

    static int a=0;
    static int b=1;
    static int c;

    public static void fabanacci_series(int k){

        for (int i=1;i<k;i++){
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;

        }
    }


    public static void main(String[] args) {
        int k=100;
        System.out.print(a + " " + b + " " );
        fabanacci_series(k);
    }
}
