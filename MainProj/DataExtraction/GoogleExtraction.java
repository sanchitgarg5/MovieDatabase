package DataExtraction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class GoogleExtraction {
	public static void main(String arg[]) throws Exception 
	{
		BufferedWriter out; 
		out	=new BufferedWriter(new FileWriter("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\googleLinks.txt"));
		loop: for(int c=1;c<=37278; c++)
		{
			String S, sp[];
		int num=c;
		BufferedReader in ;
		
		try
		{
		 in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Google\\"+num+".txt"));
		
		}
		catch(Exception E){
			continue;
		}
		//System.out.println(c);
		String t1;
		int flag=0;
		while(( S=in.readLine())!=null&&flag==0)
		{
			
			if(S.contains("href=\"http://www.google.com"))
			{
				//System.out.println(S);
				sp=S.split("http://www.imdb.com/title/");
			//	System.out.println(num);
				//System.out.println(sp[0]);
				//System.out.println(sp[1]);
				try
				{
				sp=sp[1].split("/");
				t1=sp[0];
				}
				catch(Exception Ex)
				{
					System.out.println(num);
					continue loop;
				}
				//System.out.println(num);
				//System.out.println(t1);
				
				
				out.write(t1+"\n");
				
				flag=1;			
				
			}
			
		} in.close();
		}
		out.close();
	}

}
