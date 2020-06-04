package client;

import java.io.*;
import java.net.Socket;


public class WriteTask implements Runnable {
    private PrintWriter writer;
    private BufferedReader keyboard;
    private Socket socket;

    public WriteTask(Socket clientSocket) {
        this.socket = clientSocket;
        try {
            OutputStream os = socket.getOutputStream();
            writer = new PrintWriter(os, true);
            keyboard = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException ex) {
            System.out.println("Error getting output stream: " + ex.getMessage());
        }
    }

    @
    public void run() {
        String command = "";Override
        do {
            System.out.println("> ");
            try {
                command = keyboard.readLine();
                writer.println(command);
            } catch (IOException ex) {
                System.out.println("Error writing to server: " + ex.getMessage());
            }
        }
        while (!command.equalsIgnoreCase("logout"));
    }

}
