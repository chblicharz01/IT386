import java.rmi.Naming;
/** Client class that will use the remote service */
public class HelloRMIClient{

public static void main (String[] argv) {

    try {

      HelloInterface remoteObj =
        (HelloInterface) Naming.lookup("//localhost/HelloRMIServer");

      System.out.println (remoteObj.sayHello());
      System.out.println (remoteObj.area_of_circle(2.2));

    } catch (Exception e) {
      System.out.println ("HelloClient exception: " + e);
    }
  }
}
