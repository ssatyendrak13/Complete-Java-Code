package javatPoint.javaNetworking;

import java.net.InetAddress;

public class InetAddressClass {
	
	public static void main(String args[]) {
		
		try {
			InetAddress ip=InetAddress.getByName("www.javatpoint.com");
			System.out.println("host address : "+ip.getHostAddress());
			System.out.println("host name : "+ip.getHostName());
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
