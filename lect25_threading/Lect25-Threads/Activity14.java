/** Example2.java
 *  Approach 2: Creating threads by implementing interface Runnable.
 * IT 386 - Fall 2022
 *  * TODO:
 *   Implement run() method that prints current thread name
 *   Create and start  two threads
 *   Have main thread print current thread name
  */
public class Activity14 implements Runnable {
  @Override 
  public void run()
  {
    System.out.println("Ex1: Hello from thread: " + Thread.currentThread().getName());
  }
  public static void main(String[] args)
  {
    //Code done in class
    /*
    System.out.println("Ex1: Hello from thread: " + Thread.currentThread().getName());
    Runnable obj = new Activity14();
    Thread th1 = new Thread(obj);
    Thread th2 = new Thread(obj);
    th1.start();
    th2.start();
    */
    int number_of_threads = Integer.parseInt(args[0]);
    if(args[0].length() == 0)
    {
      System.out.println("Please enter a positive integer for the number of threads in the command call.");
      System.exit(0);
    }
    Thread[] workers = new Thread[number_of_threads];
    for(int i = 0; i < number_of_threads; i++)
    {
      Runnable obj = new Activity14();
      Thread new_thread = new Thread(obj);
      new_thread.start();
    }
  }


}
