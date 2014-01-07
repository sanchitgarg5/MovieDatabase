package DataExtraction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MovieNames 
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader in; int cnt=0;
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Movie_Name.txt"));
		for(int num=1; num<=60999; num++)
		{
		try
		{
		 in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Output\\"+num+".txt"));
		 
		}
		catch(Exception E){
			continue;
		}
		String y;
		String s=in.readLine();
		String k[]=s.split(":-");
		int flag=0;
		out.write(k[1]+" ");
		while(((y=in.readLine())!=null))
		{
			/*if(y.contains("Release date :"))
				{
				//k=y.split(":");
				
				//out.write(k[1]+"\n");
				flag=1;
				}*/
			if(y.contains("Year :"))
			{
			k=y.split(":");
			
		out.write(k[1]+"\n");
			flag=1;
			}
		
		}
		if(flag==0)
		{
			out.write("\n");
			cnt++;
			in.close();
			File f=new File("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Output\\"+num+".txt");
			 boolean success =f.renameTo(new File("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Del\\"+num+".txt"));
			 System.out.println(success);
			
			
		}
		
		
		
		
		
		
		}
		out.close();
		System.out.println(cnt++);
	}

}
