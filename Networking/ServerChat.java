package Projects.ChatApplication;

import java.io.*;
import java.net.*;

public class ServerChat {

    /** Socket Variables */
    ServerSocket ss;
    Socket s;

    /** Read-Write Varibles */
    BufferedReader br;
    PrintWriter out;

    /** Constructer */
    public ServerChat(){
        try{
            ss = new ServerSocket(3000);
            System.out.println("Server is ready to accept connection");
            System.out.println("Waiting");
            s = ss.accept();

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new PrintWriter(s.getOutputStream());

            startReading();
            startWriting();
        } catch (Exception e){ e.printStackTrace(); }
    }

    public void startReading(){
        // Reading thread
        Runnable r1=()->{
            System.out.println("Reader Started...");
            try {
                while(true) {
                    String str = br.readLine();
                    if (str.equals("end")) {
                        System.out.println("Client terminated the chat...");
                        s.close();
                        break;
                    }
                    System.out.println("Client: " + str);
                } // end of while
            } catch (Exception e) { System.out.println("Connection is closed"); }
        }; // end of Runnable
        new Thread(r1).start();
} // EOF

    public void startWriting(){
        // Writing thread
        Runnable r2=()-> {
            System.out.println("Writer Started...");
            try {
                while (!s.isClosed()) {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();

                    if (content.equals("end")){
                        s.close();
                        break;
                    }
                } // end of while
            } catch (Exception e) { System.out.println("Connection Closed"); }
        }; // end of runnable
        new Thread(r2).start();
    } // EOF


    public static void main(String[] args) {
        new ServerChat();
    }
}
