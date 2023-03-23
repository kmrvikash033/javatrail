import java.io.*;
import java.util.*;
public class trail{
    public static void main(String []args)

    {
      String users="Vikash Kumar",Password="vikash";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter user id: ");
      String us = sc.nextLine();
      System.out.println("Enter Password: ");
      String pass = sc.nextLine();
      if(users.equals(us)&&Password.equals(pass)){
        System.out.println("Your are loged in your work space");
        
      }
      else{
        System.out.println("Invalid user id or password\ntry again....");
      }
    

    }
}