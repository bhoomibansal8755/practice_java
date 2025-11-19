import java.util.Scanner;

class sumofnatural {
    public static int sum(int num) {
        if (num ==1){


        return num;
        }
        else {
            return num+(num-1);
        }
    }
        // int sum=0;
        // for(int i = 1;i<=num;i++) {
        //     sum +=i;

        //     System.out.println(sum);

        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int num=10;
            int sum=0;
            for(int i = 1;i<=num;i++)
            {
                sum=sum+i;
            }
            System.out.println(sum);
        }

    }



         
    

