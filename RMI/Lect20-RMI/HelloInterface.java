import java.rmi.*;

/** Remote interface declares each of the methods
 that you want to call remotely */
public interface HelloInterface extends Remote {

    /** Remotely invocable method */
    String sayHello() throws RemoteException;
    double area_of_circle(double radius) throws RemoteException;
}
