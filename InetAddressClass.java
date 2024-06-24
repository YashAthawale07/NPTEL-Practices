import java.io.*;
import java.net.InetAddress;


public class InetAddressClass {
    public static void main(String[] args) {
       try{ InetAddress  ip = InetAddress.getByName("www.rocksdanister.com");
	   System.out.println("Host Name: "+ ip.getHostName());
	   System.out.println("IP : "+ ip.getHostAddress());
	   
	  
	   }catch(Exception e){
		   System.out.println(e);
	   }
    }
	
}
