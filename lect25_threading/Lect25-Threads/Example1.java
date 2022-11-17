/** Example1.java
 *  Approach 1: Creating threads by extending class Thread.
 * IT 386 - Fall 2022
 *  Compile with: javac Example1.java
 *  Run with: java Example1
 *
 * TODO:
 *  Implement run() method that prints current thread name
 *  Create and start  two threads
 *  Have main thread print current thread name
  */
public class Example1 extends Thread {
   /* Create run() method contains the code that is executed by the thread */
   @Override
   public void run()
   {
      System.out.println("Ex1: Hello from thread: " + Thread.currentThread().getName());
   }
   public static void main(String[] args) {
      /* Add printing stament to print current thread name (main thread)*/
      System.out.println("Ex1: Hello from thread: " + Thread.currentThread().getName());
      /* Create a thread object and start the thread*/
      Thread th1 = new Example1();
      Thread th2 = new Example1();
      th1.start();
      th2.start();

   }

}
