public class recurion {
    public static int fibo (int num) {
        {
            if(num==1)
            {
                return num;
            }
            else{
                return num*fibo(num-1);
               }   }
        }
    public static void main(String[] args)
             {
                System.out.println("fibo for #5:" + fibo(5));
                }
        }
    
    
