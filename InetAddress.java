import java.io.*;
import java.net.*;


public class InetAddress {
    public static void main(String[] args) {
       try{ InetAddress  ip = InetAddress.getByName("www.nptel.ac.in");
	   System.out.println("Host Name: "+ ip.getHostName());
	   System.out.println("IP : "+ ip.GetostAddress());
	   
	  
	   }catch(Exception e){
		   System.out.println(e);
	   }
    }
	
}
