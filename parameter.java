public class parameter {
     int roll;
    String name;
    parameter(int x,String y)
    {
        roll=x;
        name=y;
        
    }
    public static void main(String[] args) {
        parameter object =new parameter(23 ,"bhoomi");
        parameter object2 =new parameter(32 ,"ved");
        System.out.println(object.roll);
        System.out.println(object2.name);
}
}
