// in java take input as interger from user and check the value using comparion operators

import java.util.Scanner;

public class statements {
    public static void main (String[] args){
        try (Scanner S = new Scanner(System.in)) {
            int a = S.nextInt();
            int b = S.nextInt();
            int c = S.nextInt();
            if (a>b)
            {
                System.out.println("a is greater then both");
            }
            else System.out.println("b is greater");
            if (b>c)
            {
                System.out.println("b is greater ");
            }
            System.out.println("cis greater");
            if (c<a)
            {
                System.out.println("c is greater ");
            
        }
        
        System.out.println(" pta");
    }
}
}
