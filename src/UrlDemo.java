import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			URL url = new URL("http://www.sina.com");
			URLConnection con = url.openConnection();
			if(con!=null)
			{
				System.out.println("�����ӵ�"+url.getHost());
			}
			else
			{
				System.out.println("�޷����ӵ�"+url.getHost());
			}
			
			System.out.println(con.getContentLength()+" "+con.getContentType()+" "+con.getContentEncoding());
			System.out.println(con.getContentType());
//			InputStream in = con.getInputStream();//����1
			InputStream in = url.openStream();//����2
			
			InputStreamReader content = new InputStreamReader(in,"UTF-8");				
			Scanner scanner = new Scanner(content);
			scanner.useDelimiter("\n");//���ûس�����Ϊ�ָ��
			while(scanner.hasNext())
			{
				System.out.println(scanner.next());
			}
			scanner.close();
			in.close();
			content.close();
			
//			StringBuff str = new 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
