package assign04_Blicharz;
import java.rmi.Naming;

public class Client {

    public static void main (String[] argv)
    {
        try 
        {
            Compute remoteObj = (Compute) Naming.lookup("//localhost/Server");
            System.out.println("The two values are 100.0 and 10.0");
            double value1 = 100.0;
            double value2 = 10.0;
            
            //addition
            System.out.print("The addition of the two numbers: ");
            System.out.println(remoteObj.addition(value1,value2));
        }
        catch (Exception e)
        {
            System.out.println("Client exception: " + e);
        }
    }

}
