package com.chat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerMain {
    public static void main(String[] args) {
        int port=8818;
        try {
            ServerSocket serverSocket=new ServerSocket(port);    // Creates a ServerSocket Object with a port number taken by us.
            while (true)
            {   //This Shows a Persistent Connection .
                System.out.println("About to accept client Connection... ");
                Socket clientSocket=serverSocket.accept();
                System.out.println("Accepted client Connection....."+clientSocket);

                ServerWorker serverLaunch = new ServerWorker(clientSocket);
                serverLaunch.start();




            }

        }
         catch (IOException e)
         {
             e.printStackTrace();
         }


    }


}
