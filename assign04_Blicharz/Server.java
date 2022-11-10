package assign04_Blicharz;
import java.rmi.Naming;

public class Server{
    public static void main(String args[])
    {
        try
        {
            ComputeImpl obj = new ComputeImpl();
            Naming.rebind("//localhost/Server", obj);
            System.out.println("The server is ready.");
        }
        catch (Exception e)
        {
            System.out.println("The server faild: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}