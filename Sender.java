import java.io.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.DatagramSocket;




public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds= new DatagramSocket(3000);
	   String str="Welcome My Friend	";
	    InetAddress  ip = InetAddress.getByName("127.0.0.1");
	   DatagramPacket dp= new DatagramPacket(str.getBytes(),str.length(),ip,3000);
	   
	   ds.send(dp);
	   ds.close();
	  
	   
	  
	   
    }
	
}
