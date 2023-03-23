import java.util.*;
import java.io.*;
import java.math.*;
public class Ap{
    public static void main(String  []args){
        int a,n,d;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term: ");
        a = sc.nextInt();
        System.out.println("Enter the common difference: ");
        d = sc.nextInt();
        System.out.println("Enter the number of term");
        n = sc.nextInt();
        
        System.out.println("A nth term of G.P. is"+nthTermOfAp(a,d,n));
    }
    public static int nthTermOfAp(int a, int d, int N){
        int res = a*(int)(Math.pow(d,N-1));
        return res;
    }
}