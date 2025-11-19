import java.util.Scanner;

public class helloworld {
public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    String A =s.nextLine();
    String B =s.nextLine();
    int c=A.length();
    int d =B.length();
    int sum=0;
    sum=c+d;
    System.out.println("sum of A and B; " +sum);
    String e=A.toUpperCase();
    String f=B.toUpperCase();
   System.out.println(e + " " + f);
 }
}
