package zhu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstM {
    private Socket socket = null;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),4000);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = br.readLine();
            System.out.println(line);
            br.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
