/**
   A Java program for Server using Sockets
   The TCP socket server echoes every message
   from the client in UpperCase

   Conpile: javac ServerTCP.java
   Run: java ServerTCP <portNumber>

   TODO:  Complete impelentation of items 1 to 3,
   you will be part of HW02.

   IT 386 - Fall 2022
*/
import java.io.*;
import java.net.*;

class ServerTCP {
  public static void main (String args[]) throws Exception {
    String clientSentence;
    String returnSentence;
    if (args.length != 1) {
       System.err.println("Usage: java ServerTCP <port number>");
       System.exit(1);
    }
    // get  portNumber from command line input
    int portNumber = Integer.parseInt(args[0]);
    /* Creating a welcomming socket*/
    ServerSocket welcomeSocket = new ServerSocket(portNumber);
    System.out.println("TCP server waiting ...");
    /* Wait on welcomming socket for contact from the client.*/
    while (true) {
      Socket connectionSocket = welcomeSocket.accept();

      /* Create input stream attached to socket */
      BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
      /* Read in the line from Socket */
      clientSentence = inFromClient.readLine();
       System.out.println("Message from Client: " + clientSentence);
      /* 1 - Create a return message, can simple transform sentence toUpperCase */
      returnSentence = clientSentence.toUpperCase();
      /* 2 - Create output stream, attched to socket */
      DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
      /* 3 -  Write the line out to Socket */
      outToClient.writeBytes(returnSentence+ '\n');
      welcomeSocket.close();
    } // end of while, wait for another Client
  }
}
