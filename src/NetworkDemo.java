import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class NetworkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		URL url = new URL();
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("������IP��ַ��"+ip.getHostAddress());
			System.out.println("���������֣�"+ip.getHostName());
			System.out.println("���������֣�"+ip.getAddress());
			System.out.println("�����ܷ񵽴"+ip.isReachable(500));
			System.out.println("��û�·��ַ��"+ip.getLoopbackAddress());
			System.out.println("����������ĵ�ַ��"+InetAddress.getByName("www.sina.com.cn").getHostAddress());
			System.out.println("�������Ƿ�����ͨ��"+InetAddress.getByName("www.sina.com.cn").isReachable(500));
			
			byte[] address = ip.getAddress();
			for(int i=0;i<address.length;i++)
				System.out.print(address[i]+" ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
