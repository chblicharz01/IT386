/*Chris Blicharz
 * Compute Implementation File
 * 11/10/2022
 */
package assign04_Blicharz;

import java.rmi.*;
import java.rmi.server.*;

public class ComputeImpl extends UnicastRemoteObject implements Compute{
    
    //explicit constructor
    public ComputeImpl() throws RemoteException{};
    
    //the addition of the two numbers
    public double addition(double value1, double value2) throws RemoteException
    {
        return value1 + value2;
    }

    //the subtraction between the two numbers
    public double subtraction(double value1, double value2) throws RemoteException
    {
        return value1 - value2;
    }

    //the multiplication between the two numbers
    public double multiplication(double value1, double value2) throws RemoteException
    {
        return value1 * value2;
    }

    //the division between the two numbers
    public double division(double value1, double value2) throws RemoteException
    {
        return value1/value2;
    }

    //the gcd of the two numbers
    public double greatest_common_divisor(double value1, double value2) throws RemoteException
    {
        if(value1 == 0)
        {
            return value1;
        }
        else
        {
            return greatest_common_divisor(value2 % value1, value2);
        }
    }

    //the area of the circle
    public double area_of_circle(double radius) throws RemoteException{
        return (radius * radius * 3.14);
    }
}
