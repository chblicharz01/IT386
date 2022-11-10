/*Chris Blicharz
 * Client File
 * 11/10/2022
 */
package assign04_Blicharz;

import java.rmi.Naming;

public class Client {

    public static void main (String[] argv)
    {
        try 
        {
            //setup of the connection
            Compute remoteObj = (Compute) Naming.lookup("//localhost/Server");
            System.out.println("The two values are 100.0 and 10.0");
            double value1 = 100.0;
            double value2 = 10.0;
            
            //Test of the methods written 
            System.out.print("\nThe addition of the two numbers: ");
            System.out.println(remoteObj.addition(value1,value2));

            System.out.print("\nThe subtraction of the two numbers: ");
            System.out.println(remoteObj.subtraction(value1,value2));

            System.out.print("\nThe multiplication of the two numbers: ");
            System.out.println(remoteObj.multiplication(value1,value2));

            System.out.print("\nThe division of the two numbers: ");
            System.out.println(remoteObj.division(value1,value2));

            System.out.print("\nThe greatest common divisor of the two numbers: ");
            System.out.println(remoteObj.greatest_common_divisor(value1,value2));

            System.out.print("\nThe area of a circle with radius 10.0: ");
            System.out.println(remoteObj.area_of_circle(value2));
        }
        catch (Exception e)
        {
            System.out.println("Client exception: " + e);
        }
    }

}
