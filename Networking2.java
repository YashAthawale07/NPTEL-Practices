import java.io.*;
import java.net.*;


public class Networking2 {
    public static void main(String[] args) {
       try{ 
	   
	   URL url= new URL("https://www.youtube.com/watch?v=iJUQHvsU68c&list=PLfn3cNtmZdPOe3R_wO_h540QNfMkCQ0ho&index=49");
	HttpURLConnection huc=(HttpURLConnection)url.openConnection();
	   for(int i=1;i<=8;i++){
		   System.out.println(huc.getHeaderFieldKey(i)+huc.getHeaderField(i));
	   }
	   huc.disconnect();
	   }catch(Exception e){
		   System.out.println(e);
	   }
    }
	
}
