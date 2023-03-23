public class Test{
public static void main(String []args){
    int x = 10;
    Integer y = x; //autoboxing
    int z = y;  //auto-unboxing
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    Integer a=400,b=400;
    if(a==b) System.out.println("Same");
    else System.out.println("Not Same");
}
}