package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;

public class Client {

    static String ipAddress = "";

    /* ip server
     LAN  : 172.19.236.28 
            172.19.236.83
     WIFI : 172.19.26.89*/
    
    public static void getIp(String ipAddress) {
        Client.ipAddress = ipAddress;
    }

    public String sendMsg(String name, String msg, int portNo) {
        String returnMsg = "";
        try {
            
            Socket client = new Socket(ipAddress, portNo);
            InputStream clientIn = client.getInputStream();
            OutputStream clientOut = client.getOutputStream();
            PrintWriter pw = new PrintWriter(clientOut, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
            //send message to socket
            pw.println(name + "#" + msg);
            returnMsg = br.readLine().toString();
            pw.close();
            br.close();
            client.close();
        } catch (ConnectException ce) {
            returnMsg = "Cannot connect to the server";
        } catch (IOException ie) {
            returnMsg = "Error";
        }
        //System.out.println(">> returnMsg  = "+returnMsg) ;
        return returnMsg;
    }
}
