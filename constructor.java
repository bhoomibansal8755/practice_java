class constructor {
    int x;
    String y;
    constructor(){
        x=10;
        y="HELLO";
        
    }
    public static void main(String[] args) {
        constructor object =new constructor();
        System.out.println(object.x);
        System.out.println(object.y);
    }
}
