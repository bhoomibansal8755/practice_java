import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
//         int arr1[]=new int[4];
//         arr1[0]=10;
//         arr1[1]=20;
//         arr1[2]=30;
//         arr1[3]=40;
//         // System.out.println(arr1[]);
//         int sum =0;
//         for(int i =0;i<4;i++)
//         {
//             sum += arr1[i];
//         }
//         System.out.println(sum);

//     
         Scanner s = new Scanner(System.in);
        //  size of array
        int n = s.nextInt();
        // elements
        int arr1[]= new int[n];
        int sum = 0;
        for(int i = 0; i<n;i++){ 
            arr1[i]=s.nextInt();}
        for(int j = 0; j<n;j++){ 
            sum += arr1[j];
        }
        System.out.println(sum);
    }
}

  
