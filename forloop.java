import java.util.Scanner;

public class forloop {
    
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        int n=S.nextInt();
        int sum=0;
        int i;
        for(i=0;i<=n;i++)
        {
            sum = sum+(i*i);
            System.out.println("Day: " + i);
        }
        System.out.println(sum);

     S.close();
    }
    
}

    
