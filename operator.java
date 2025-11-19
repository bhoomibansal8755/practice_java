import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        
        if(a>b&&c>a||a<b)
        {
           System.out.println("a ");
        }
         else if(b>c&&a>b||b<c)
        {
            System.out.println("b");
        }
        else if(c>b&&a>c||c<b)
        {
            System.out.println("c");
        }
        
        s.close();
    }

}
