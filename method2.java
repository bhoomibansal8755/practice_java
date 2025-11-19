public class method2 {
    public static void main(String[] args) {
        int arr[]={21,12,34,4,6};
        int count =0;
   // for-each loop
        for(int num:arr)
        {

        if(num%3==0)
        count=count+1;

        }
        System.out.println(count);
    }
}