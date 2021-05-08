/*
 * Shows Network Configuration
 * */
import java.net.*;
import java.util.Scanner;
public class NetworkConfig {
    public static void main(String[] args){
        String host;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter host name: ");
        host = scan.nextLine();
        try{
        InetAddress ip=InetAddress.getByName(host);
        //InetAddress ip=InetAddress.getByName("void");
        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
        System.out.println("Host Name- "+ip.getHostName());
        System.out.println("IP Address- "+ip.getHostAddress());
        System.out.print("MAC Address- ");
         byte[] mac = ni.getHardwareAddress();
                if (mac != null) {

                    for (int k = 0; k < mac.length; k++) {
                        System.out.format("%02X%s", mac[k], (k < mac.length - 1) ? "-" : "");
                    }
        }
        System.out.println();
        }
        catch(Exception e){System.out.println(e);}
    }
    
    
}
