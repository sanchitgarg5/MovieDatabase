package DataExtraction;


import java.io.*;

import java.net.*;
public class IMDBExtraction
{
	
	
public static void main(String args[]) throws IOException
{  
	String historyFile="";
	
	
	
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\googleLinks.txt"));
		
		for(int l=1; l<=25879; l++)
		{
			String S=br.readLine();
		}
		for(int i=25880;i<=25880; i++)
		{
			/*try {
				Thread.sleep(750);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			String S=br.readLine();
			//String k=S.replaceAll(" ", "+");
		
		System.out.println("Movie no:   "+i);
	try{	
	
	historyFile="C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\IMDB\\"+i+".txt";
 
	URL url1 = new URL("http://www.imdb.com/title/"+S);
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