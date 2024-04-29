import java.rmi.*;
import java.util.Scanner;
public class Client {
public static void main(String args[]) { 
    Scanner sc=new Scanner(System.in);
try {
    String serverURL="rmi://localhost/Server";
    ServerInterface serverInterface= (ServerInterface) Naming.lookup(serverURL);
    System.out.println("Enter First Number:");
    double num1=sc.nextDouble();
     System.out.println("Enter Second Number:");
    double num2=sc.nextDouble();
     System.out.println("-----------Result--------:");
     System.out.println("First Number Is :"+num1);
     System.out.println("Second Number Is :"+num2);
     System.out.println("Addition Is :"+serverInterface.addition(num1,num2));

} 
catch (Exception e) { System.out.println("Exception: "+ e);
}
}
}


