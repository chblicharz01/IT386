package assign04_Blicharz;
import java.rmi.*;
import java.rmi.server.*;

public class ComputeImpl extends UnicastRemoteObject implements Compute{
    
    public ComputeImpl() throws RemoteException{};
    
    public double addition(double value1, double value2) throws RemoteException
    {
        return value1 + value2;
    }

    public double subtraction(double value1, double value2) throws RemoteException
    {
        return value1 - value2;
    }

    public double multiplication(double value1, double value2) throws RemoteException
    {
        return value1 * value2;
    }

    public double division(double value1, double value2) throws RemoteException
    {
        return value1/value2;
    }

    public double greatest_common_divisor(double value1, double value2) throws RemoteException
    {
        if(value1 == 0)
        {
            return value2;
        }
        else
        {
            return greatest_common_divisor(value2 % value1, value2);
        }
    }

    public double area_of_circle(double radius) throws RemoteException{
        return (radius * radius * 3.14);
    }
}
