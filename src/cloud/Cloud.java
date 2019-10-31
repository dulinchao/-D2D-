package cloud;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Cloud {
    public static void main(String[] args) {
        ServerSocket cloud; //服务端ServerSocket
        DataMaker dm = new DataMaker();
        {
            try {
                cloud = new ServerSocket(4000);
                while(true){
                    Socket socket = cloud.accept();
                    PrintStream ps = new PrintStream(socket.getOutputStream());
                    ps.println(dm.readLine());
                    ps.close();
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
