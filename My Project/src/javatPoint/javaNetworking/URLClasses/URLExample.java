package javatPoint.javaNetworking.URLClasses;
import java.net.URL;
public class URLExample {
	
	public static void main(String args[]) {
		
		try {
			
			URL url = new URL("https://www.javatpoint.com/URL-class");
			System.out.println("host name : "+url.getHost());
			System.out.println("protocol  : "+url.getProtocol());
			System.out.println("port numbre : "+url.getPort());
			System.out.println("default port number : "+url.getDefaultPort());
			System.out.println("file name : "+url.getFile());
			System.out.println("query  : "+url.getQuery());
			System.out.println("path : "+url.getPath());
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
