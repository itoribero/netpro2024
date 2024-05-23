import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckLocalAddress {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Ip address is: "+ addr.getHostAddress());
    }
}
