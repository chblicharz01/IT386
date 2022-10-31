import java.rmi.Naming;
/* Remote Server class
*/
public class HelloRMIServer {
    public static void main(String args[])
    {
        try
        {
            Hello obj = new Hello("Hello There!!");
            // Bind this object instance to the name "HelloServer"
            Naming.rebind("//localhost/HelloRMIServer", obj);
            System.out.println("The Hello server is ready");
        }
        catch (Exception e)
        {
            System.out.println("Hello Server failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
