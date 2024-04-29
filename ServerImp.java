import java.rmi.*;
import java.rmi.server.*;
//class that implements the remote interface
public class ServerImp extends UnicastRemoteObject 
implements ServerInterface {
//constructor
public ServerImp() throws RemoteException {
}
//implement method declared in the interface
public double addition(double d1, double d2) throws RemoteException {
 return d1 + d2; }
}