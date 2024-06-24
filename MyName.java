import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyName {
    public static void main(String[] args) {
        try {
            // Hostname ko specify kare
            String hostname = "https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=how+too+run+java+class+using+cmd";

            // InetAddress object create kare
            InetAddress address = InetAddress.getByName(hostname);

            // IP address ko retrieve kare
            String ipAddress = address.getHostAddress();
            
            // IP address ko print kare
            System.out.println("IP Address for " + hostname + ": " + ipAddress);
        } catch (UnknownHostException e) {
            System.err.println("Host not found: " + e.getMessage());
        }
    }
}