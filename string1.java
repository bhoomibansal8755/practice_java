import java.util.Scanner;
// length finding
public class string1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int len=a.length();
        System.out.println(len);

        // string builder
        StringBuilder sb =new StringBuilder("hi");
        System.out.println("length of string "  + sb.length() );

        // string buffer
        StringBuffer b =new StringBuffer();
        System.out.println("length of string "  +   b.length() );
        
    }
    
        }
