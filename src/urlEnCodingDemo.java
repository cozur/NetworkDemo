import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class urlEnCodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			String str = "中国";	
			//对str进行编码
			System.out.println(URLEncoder.encode(str,"utf-8"));
			//对str进行解码
			System.out.println(URLDecoder.decode(str, "utf-8"));
			
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		

	}

}
