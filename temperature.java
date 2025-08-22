import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temperature= s.nextInt();
         if(temperature>40){
            System.out.println(" temperature too hot");
        }
        else if ( temperature>0){
            System.out.println("it is normal");
        }
        else  {
            System.out.println("temperature is too c");
        }
    }
}
        
             
  
    
