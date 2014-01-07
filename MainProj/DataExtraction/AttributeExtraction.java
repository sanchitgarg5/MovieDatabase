package DataExtraction;

import java.io.*;


public class AttributeExtraction {
	static String S, sp[];
	public static void main(String arg[]) throws Exception 
	{
		for(int c=35000;c<=65000; c++)
		{
			
		int num=c;
		BufferedReader in;
		BufferedWriter out;
		try
		{
		 in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		 out	=new BufferedWriter(new FileWriter("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Output\\"+num+".txt"));
		}
		catch(Exception E){
			continue;
		}
		System.out.println(c);
		String t1;
		int flag=0;
		while(( S=in.readLine())!=null&&flag==0)
		{
			
			if(S.contains("<title>"))
			{
				
				sp=S.split(" &");
				sp=sp[0].split(">");
				t1=sp[1];
				//System.out.println(t1);
				
				out.write("Movie :-"+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		
		/***************Runtime *******************/
		
		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p><strong>Runtime:</strong>"))
			{
				
				sp=S.split("<p><strong>Runtime:</strong> <span id=\"runtime\">");
				
				sp=sp[1].split("<");
				t1=sp[0];
				
				
				out.write("Runtime :"+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		
		/*****************************************/
		/***************Budget *******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p><strong>Budget:</strong> "))
			{
				//System.out.println(S);
				sp=S.split("<p><strong>Budget:</strong> <span id=\"budget\">");
				//System.out.println(sp[1]);
				sp=sp[1].split("<");
				t1=sp[0];
				//System.out.println(t1);
				
				out.write("Budget :"+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		
		/*****************************************/
		/***************Revenue *******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p><strong>Revenue:</strong>"))
			{
				//System.out.println(S);
				sp=S.split("<p><strong>Revenue:</strong> <span id=\"revenue\">");
				//System.out.println(sp[1]);
				sp=sp[1].split("<");
				t1=sp[0];
				//System.out.println(t1);
				
				out.write("Revenue :"+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		
		/*****************************************/
		/***************Language*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p><strong>Language(s):</strong>"))
			{
				//System.out.println(S);
				sp=S.split("<span id=\"languages\">");
				//System.out.println(sp[1]);
				sp=sp[1].split("<");
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				
				out.write("Language :"+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		/*****************************************/
		/***************Webpage*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p><strong>Webpage:</strong>"))
			{
				if(S.contains("href"))
				{
					//System.out.println(S);
					sp=S.split("href=\"");
					//System.out.println(sp[1]);
					sp=sp[1].split("\"");
					t1=sp[0];
					//System.out.println("T1:  "+t1);
					
					out.write("Webpage :"+t1+"\n");
				}
					
				
				else
				{
				out.write("Webpage :-\n");
				}
				
				flag=1;			
				
			}
			
		}
		/*****************************************/
		/***************Release date & Certification*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<ul class=\"certification\">"))
			{
				S=in.readLine();
				//System.out.println(S);
				sp=S.split("<p>Released: ");
				//System.out.println(sp[1]);
				sp=sp[1].split("<");
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				String format[]=t1.split("-");
				out.write("Release date :"+format[2]+"-"+format[1]+"-"+format[0]+"\n");
				
				sp=S.split("Rated: ");
				//System.out.println(sp[1]);
				sp=sp[1].split("<");
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				
				out.write("Certification :"+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		/*****************************************/
		/***************Year*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains(" id=\"year\">("))
			{
				//System.out.println(S);
				sp=S.split(" id=\"year\">\\(");
				//System.out.println(sp[1]);
				sp=sp[1].split("\\)");
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				
				out.write("Year :"+t1+"\n");
				
				flag=1;			
				
			}
		}
		
		/*****************************************/
		/***************Rating*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p class=\"average\">"))
			{
				//System.out.println(S);
				sp=S.split("<p class=\"average\">");
				//System.out.println(sp[1]);
				sp=sp[1].split("<");
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				
				out.write("Rating :"+t1+"\n");
				
				flag=1;			
				
			}
		}
		
		/*****************************************/
		/***************Tagline*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p id=\"tagline\">"))
			{
				if(S.equals("<p id=\"tagline\"></p>"))
				{
					out.write("Tagline :-\n");
					flag=1;
				}
				else
				{
				//System.out.println(S);
				sp=S.split(";");
				//System.out.println(sp[1]);
				sp=sp[1].split("&");
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				
				out.write("Tagline :"+t1+"\n");
				
				flag=1;	
				}
				
			}
		}
		/*****************************************/
		/***************Director*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			String s="";
			int cnt=0;
			if(S.contains("table id=\"Directing\""))
			{
				while(!(S=in.readLine()).contains("</tbody>"))
				{
					if(S.contains("\"person\""))
					{
						sp=S.split("/person/");
						//System.out.println(sp[1]);
						sp=sp[1].split(">");
						sp=sp[1].split("<");
						t1=sp[0];
						s=s+t1+",";
						//System.out.println("T1:  "+name);
						
						
					}
				
				}
				String k=s.substring(0, s.length()-2);
				out.write("Director :"+k+"\n");
				
				flag=1;
				
			}
		}
		/*****************************************/
		/***************Editor*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			String s="";
			int cnt=0;
			if(S.contains("table id=\"Editing\""))
			{
				while(!(S=in.readLine()).contains("</tbody>"))
				{
					if(S.contains("\"person\""))
					{
						sp=S.split("/person/");
						//System.out.println(sp[1]);
						sp=sp[1].split(">");
						sp=sp[1].split("<");
						t1=sp[0];
						s=s+t1+",";
						//System.out.println("T1:  "+name);
						
						
					}
				
				}
				String k=s.substring(0, s.length()-2);
				out.write("Editor :"+k+"\n");
				
				flag=1;
				
			}
		}
		
		/*****************************************/
		/***************Cast table*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			String s="";
			
			if(S.contains("<div id=\"empty-cast\">"))
			{
				out.write("Cast :-\n");
				flag=1;
			}
				
				
					
			
			else if(S.contains("<table id=\"castTable\" "))
			{
				while(!(S=in.readLine()).contains("</tbody>"))
				{
					if(S.contains("\"person\""))
					{
						sp=S.split("/person/");
						//System.out.println(sp[1]);
						sp=sp[1].split(">");
						sp=sp[1].split("<");
						t1=sp[0];
						s=s+t1+",";
						//System.out.println("T1:  "+name);
						
						
					}
				
				}
				try
				{
				String k=s.substring(0, s.length()-2);
				out.write("Cast :"+k+"\n");
				}catch(Exception StringIndexOutOfBoundsException )
				{
					out.write("Cast :-\n");
				}
				
				flag=1;
				
			}
		}
		
		/*****************************************/
		/***************Description*******************/
		

		in =new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\Input\\"+num+".txt"));
		flag=0;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("name=\"description\""))
			{
				//System.out.println(S);
				sp=S.split(" name=\"description\" content=\"");
				//System.out.println(sp[1]);
				try
				{
				sp=sp[1].split("\"");
				}
				catch(Exception ArrayIndexOutOfBoundsException )
				{
					sp[0]=in.readLine();
				}
				t1=sp[0];
				//System.out.println("T1:  "+t1);
				
				out.write("Description :"+t1+"\n");
				
				flag=1;			
				
			}
			
		}





		
		out.close();
		in.close();
		 
		}
		 
	}

}
