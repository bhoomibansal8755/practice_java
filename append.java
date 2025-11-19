import java.util.Scanner;

public class append {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String b=s.nextLine();
        b.concat("world");
        System.out.println("string after appending the world " +b);
        // append by builder
        StringBuilder a=new StringBuilder( "hello");
        a.append("world!!!!");
        System.out.println("string after appending the world" + a);
        //  append by buffer
        StringBuffer c=new StringBuffer( "hello");
        c.append("world.....");
         System.out.println("string after appending the world" +c);

    }
}
