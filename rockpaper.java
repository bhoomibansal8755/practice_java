import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
       String M=S.nextLine();
       switch (M) {
        case ("Scissors"):
            System.out.println("Rock");
            break;
       case ("paper"):
            System.out.println("Scissor");
            break;
        case("rock"):
            System.out.println("paper");
            break;
        default:
            System.out.println("invaild case");
        break;

       }


       S.close();
    }
    

}
