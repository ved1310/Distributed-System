import java.rmi.*;

public class Server {
public static void main(String args[]) {
try { 
//create remote object
ServerImp serverImp = new ServerImp(); 
//bind the remote object
Naming.rebind("Server", serverImp);
System.out.println("Server Started");
}
catch (Exception e) {
System.out.println("Exception: "+ e);
}}}