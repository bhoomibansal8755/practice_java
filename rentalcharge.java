import java.util.Scanner;

public class rentalcharge {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        //  charges per hours
        int R1 =sc.nextInt();
        // for additional charges
        int R2 =sc.nextInt();
        // no.of hours per n no.
        int N =sc.nextInt();
        // total travel
        int X =sc.nextInt();
      
        int a = X-N;
        int c = (R1*N) + (R2*a);
        System.out.println(c);

}}
