package DataExtraction;

import java.io.*;
import java.net.*;

public class scrapper {
	
	public static void getURLContent(URL url) throws IOException {
		  //URLConnection conn = url.openConnection();
		
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
		conn.addRequestProperty("User-Agent", "Mozilla/4.76"); 
		  String encoding = conn.getContentEncoding();
		  if (encoding == null) {
		    encoding = "ISO-8859-1";
		  }
		  BufferedReader br = new BufferedReader(new
		      InputStreamReader(conn.getInputStream(), encoding));
		  StringBuilder sb = new StringBuilder(16384);
		  try {
		    String line;
		    while ((line = br.readLine()) != null) {
		      sb.append(line);
		      sb.append('\n');
		    }
		    System.out.println(sb);
		  } finally {
		    br.close();
		  }
		 // return sb;
		}
	public static void main(String arg[]) throws Exception
	{
		System.setProperty("http.agent", "");
		URL url = new URL("http://www.google.com");
		getURLContent(url);

	}


}
