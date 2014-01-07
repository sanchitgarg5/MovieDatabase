package DataExtraction;
import java.io.*;

import java.net.*;
public class HTMLFileDownloader
{
	
	
public static void main(String args[]) throws IOException
{  String array[]=new String[61000];
	
	String url="";
	String historyFile="";
	System.setProperty("http.agent", ""); 
	String movie="the tourist";
	System.out.println(movie);
	String year="2010";
	
	movie.replaceAll("t", "aksdlkj");
	System.out.println(movie);
	for(int i=1;i<=1; i++)
	{
		
		
		System.out.println("Movie no:   "+i);
	try{	
	//url="http://www.google.com/search?q=thetourist+2010+wiki";		//+i;
	historyFile="C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\wiki\\"+i+".txt";
 
	URL url1 = new URL("http://www.google.com/search?q=thetourist+2010+wiki");
	HttpURLConnection conn = (HttpURLConnection) url1.openConnection(); 
	conn.addRequestProperty("User-Agent", "Mozilla/4.76"); 
java.io.BufferedInputStream in = new java.io.BufferedInputStream(conn.getInputStream());
java.io.FileOutputStream fos = new java.io.FileOutputStream(historyFile);
java.io.BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
byte[] data = new byte[1024];
int x=0;
while((x=in.read(data,0,1024))>=0)
{
bout.write(data,0,x);

}
bout.close();
in.close();

	}
	catch(Exception e)
	{
		e.printStackTrace();
		continue;
	}
}
}
}