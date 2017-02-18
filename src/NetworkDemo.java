import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class NetworkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		URL url = new URL();
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("服务器IP地址："+ip.getHostAddress());
			System.out.println("服务器名字："+ip.getHostName());
			System.out.println("服务器名字："+ip.getAddress());
			System.out.println("本机能否到达："+ip.isReachable(500));
			System.out.println("获得回路地址："+ip.getLoopbackAddress());
			System.out.println("获得新浪网的地址："+InetAddress.getByName("www.sina.com.cn").getHostAddress());
			System.out.println("新浪网是否能联通："+InetAddress.getByName("www.sina.com.cn").isReachable(500));
			
			byte[] address = ip.getAddress();
			for(int i=0;i<address.length;i++)
				System.out.print(address[i]+" ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
