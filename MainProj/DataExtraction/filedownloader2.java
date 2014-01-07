package DataExtraction;


import java.io.*;

import java.net.*;
public class filedownloader2
{
	
	public static String [] fileToArray()
	{   int bugArray[]=new int[32];
	    String bugArray1[]=new String[32];
	    String currentRow="";
	    int i=-1;
	    int j=-1;
	    File file=new File("resultset1.csv");
	try{
		
		BufferedReader reader =new BufferedReader(new FileReader(file));
		while((currentRow =reader.readLine())!= null)
		{
			bugArray[++i]=Integer.parseInt(currentRow);
			bugArray1[++j]=currentRow;
			//System.out.println(Integer.parseInt(currentRow));
		}
		reader.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
		return bugArray1;
	}
public static void main(String args[]) throws IOException
{  //String array[]=new String[61000];
	//array=HTMLFileDownloader.fileToArray();
	String url="";
	String historyFile="";
	
	for(int i=35000;i<=35000;i++)
	{
		
		System.out.println("Movie no:   "+i);
	try{	
	url="http://www.themoviedb.org/movie/"+i+"/cast";		//+i;
	historyFile="C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+i+".txt";
 
java.io.BufferedInputStream in = new java.io.BufferedInputStream(new 
 
java.net.URL(url).openStream());
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
		//e.printStackTrace();
		continue;
	}
}
}
}