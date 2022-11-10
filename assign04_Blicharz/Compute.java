/*Chris Blicharz
 * Compute Interface File
 * 11/10/2022
 */
package assign04_Blicharz;

import java.rmi.*;

public interface Compute extends Remote {
    //returns the addition of two numbers
    double addition(double value1, double value2) throws RemoteException; 

    //returns the subtraction of two numbers
    double subtraction(double value1, double value2) throws RemoteException;

    //returns the multiplication of two numbers
    double multiplication(double value1, double value2) throws RemoteException;

    //returns the division of two numbers
    double division(double value1, double value2) throws RemoteException;

    //returns the greatest common divisor using Euclidean Algorithm
    double greatest_common_divisor(double value1, double value2) throws RemoteException;

    //returns the area of a circle
    double area_of_circle(double radius) throws RemoteException;
}
