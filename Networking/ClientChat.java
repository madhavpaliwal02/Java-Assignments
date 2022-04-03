import java.io.*;
import java.net.*;

public class ClientChat {

    /** Socket Variables */
    Socket s;

    /** Read-Write Varibles */
    BufferedReader br;
    PrintWriter out;

    public ClientChat(){
        try{
            System.out.println("Sending request to server");
            s = new Socket("127.0.0.1", 3000);
            System.out.println("Connection Done");

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new PrintWriter(s.getOutputStream());

            startReading();
            startWriting();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void startReading(){
        // Reading thread
        Runnable r1=()->{
            System.out.println("Reader Started...");
            try {
                while(true) {
                    String str = br.readLine();
                    if (str.equals("end")) {
                        System.out.println("Server terminated the chat...");
                        s.close();
                        break;
                    }
                    System.out.println("Server: " + str);
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
            } catch (Exception e) { System.out.println("Connection is closed"); }
        }; // end of runnable
        new Thread(r2).start();
    } // EOF


    public static void main(String[] args) throws Exception {
        new ClientChat();
    }
}
