import java.util.Scanner; 

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System .in);
        int n=s.nextInt();
        int arr1[]=new int[4];

        for(int i=0;i<n;i++)
        {
           arr1[i]=s.nextInt();
        }
        // actual array
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
         System.out.println();
        // reverse array
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(arr1[j]+" ");
        }
        

    }
    }

