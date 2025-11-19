// import java.util.Scanner;

public class alice {
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        // int N=s.nextInt();
        int arr[]={21,12,34,4,6};
        int count =0;

        for(int num:arr)
        {
         
        if(num%3==0)
        count=count+1;
        
        }
        System.out.println(count);
     }
} 
