package DataExtraction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class AsciiFinder{
	static BufferedReader in; 
	static BufferedWriter out;

	public static void main(String arg[]) throws Exception
	{
		for(int i=1; i<1000; i++)
		{
			try{
		in= new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\AttributeFiles\\"+i+".txt"));
		
			}catch(Exception ex){}
			
			String S, data="";
		while(( S=in.readLine())!=null)
		{
			data=data+S+"\n";
		}
		if(data.contains("&#"))
		{
			int y=data.indexOf("&#");
			System.out.println(data.substring(y, y+5));
		}
		}
	}
}