/** Example2.java
 *  Approach 2: Creating threads by implementing interface Runnable.
 * IT 386 - Fall 2022
 *  * TODO:
 *   Implement run() method that prints current thread name
 *   Create and start  two threads
 *   Have main thread print current thread name
  */
public class Example2 implements Runnable {
  @Override 
  public void run()
  {
    System.out.println("Ex1: Hello from thread: " + Thread.currentThread().getName());
  }
  public static void main(String[] args)
  {
    System.out.println("Ex1: Hello from thread: " + Thread.currentThread().getName());
    Runnable obj = new Example2();
    Thread th1 = new Thread(obj);
    Thread th2 = new Thread(obj);
    th1.start();
    th2.start();
  }


}
