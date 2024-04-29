import java.rmi.*;
public interface ServerInterface extends Remote { 
//method declaration 
double addition(double d1, double d2) throws RemoteException;
}