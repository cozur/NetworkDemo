import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class urlEnCodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			String str = "�й�";	
			//��str���б���
			System.out.println(URLEncoder.encode(str,"utf-8"));
			//��str���н���
			System.out.println(URLDecoder.decode(str, "utf-8"));
			
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		

	}

}
