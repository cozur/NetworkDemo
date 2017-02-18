import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://www.sina.com");
			URLConnection con = url.openConnection();
			System.out.println(con.getContentLength());
			System.out.println(con.getContentType());
			InputStream in = url.openStream();
			InputStreamReader content = new InputStreamReader(in,"utf-8");
			Scanner scanner = new Scanner(content);
			scanner.useDelimiter("\n");
			while(scanner.hasNext())
				{
				   System.out.println(scanner.next());
				}
			scanner.close();
			in.close();
			content.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
