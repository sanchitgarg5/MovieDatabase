package DataExtraction;

import java.io.*;

public class AsciiReplacer {
	static BufferedReader in; 
	static BufferedWriter out ;

	public static void main(String arg[]) throws Exception
	{
		for(int i=1; i<=35926; i++)
		{
		try
		{
		in= new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\AttributeFiles\\"+i+".txt"));
		}
		catch(Exception ex)
		{continue;}
		
		String S, data="";
		while(( S=in.readLine())!=null)
		{
			data=data+S+"\n";
		}
		
		//System.out.println(data);
		in.close();
		String k;
		
		if(data.contains(k="&#xE4;"))
		{
			 data=data.replaceAll(k, "a");
			
		}
		if(data.contains(k="&#xE9;"))
		{
			 data=data.replaceAll(k, "e");
			
		}
		if(data.contains(k="&auml;"))
		{
			 data=data.replaceAll(k, "a");
			
		}
		if(data.contains(k="&#xF6;"))
		{
			 data=data.replaceAll(k, "o");
			
		}
		if(data.contains(k="&#xC9;"))
		{
			 data=data.replaceAll(k, "E");
			
		}
		if(data.contains(k="&#xE8;"))
		{
			 data=data.replaceAll(k, "e");
			
		}
		if(data.contains(k="&#x27;"))
		{
			 data=data.replaceAll(k, "'");
			
		}
		if(data.contains(k="&#x22;"))
		{
			 data=data.replaceAll(k, "\"");
			
		}
		if(data.contains(k="&#xEB;"))
		{
			 data=data.replaceAll(k, "e");
			
		}
		if(data.contains(k="&#163;"))
		{
			 data=data.replaceAll(k, "£");
			
		}
		if(data.contains(k="&#xEE;"))
		{
			 data=data.replaceAll(k, "i");
			
		}
		if(data.contains(k="&#xF4;"))
		{
			 data=data.replaceAll(k, "o");
			
		}
		if(data.contains(k="&#xED;"))
		{
			 data=data.replaceAll(k, "i");
			
		}
		if(data.contains(k="&#xFC;"))
		{
			 data=data.replaceAll(k, "u");
			
		}
		if(data.contains(k="&#xE1;"))
		{
			 data=data.replaceAll(k, "a");
			
		}
		if(data.contains(k="&#836;"))
		{
			 data=data.replaceAll(k, "");
			
		}
		if(data.contains(k="&#x26;"))
		{
			 data=data.replaceAll(k, "&");
			
		}
		if(data.contains(k="&#xDF;"))
		{
			 data=data.replaceAll(k, "B");
			
		}
		if(data.contains(k="&#xCD;"))
		{
			 data=data.replaceAll(k, "I");
			
		}
		if(data.contains(k="&#xF8;"))
		{
			 data=data.replaceAll(k, "o");
			
		}
		if(data.contains(k="&#xF3;"))
		{
			 data=data.replaceAll(k, "o");
			
		}
		if(data.contains(k="&#xE7;"))
		{
			 data=data.replaceAll(k, "c");
			
		}
		if(data.contains(k="&#xE5;"))
		{
			 data=data.replaceAll(k, "a");
			
		}
		
		if(data.contains("&#"))
		{
			int z=data.indexOf("&#");
			 data=data.replaceAll(data.substring(z, z+6), "");
			
		}
		
		
		
		out	=new BufferedWriter(new FileWriter("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\AttributeFiles\\"+i+".txt"));
		out.write(data);
		
		out.close();
		System.out.println(i);
		}
	}
}
