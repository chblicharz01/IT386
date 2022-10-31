import java.rmi.*;
import java.rmi.server.*;
/**java
 * Remote server class that implements HelloInterface
*/
public class Hello extends UnicastRemoteObject implements HelloInterface{
    private String message;

    /** Constructor for remote object */
    public Hello (String msg) throws RemoteException{
        message = msg;
    }

    /** Implementation of remotely invocable method*/
    public String sayHello() throws RemoteException{
        return message;
    }

    public double area_of_circle(double radius) throws RemoteException{
        return (radius * radius * 3.14);
    }
}