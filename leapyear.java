// it divisible by 4 or it divisible by 400 and 100 both
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner l =new Scanner(System.in);
        int leapyear=l.nextInt();
        if (leapyear%4==0 && leapyear%100!=0|| leapyear%400==0){
            System.out.println("it is leap year ");
        }
        else{
        System.out.println("Not event ");
    }
    l.close();
}
}
