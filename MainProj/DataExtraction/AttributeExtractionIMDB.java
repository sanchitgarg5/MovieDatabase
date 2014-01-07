package DataExtraction;

import java.io.*;


public class AttributeExtractionIMDB {
	static String S, sp[];
	static RandomAccessFile in;
	static BufferedWriter out, out1;
	static int num;
	static long pos;
	static long endcast_pos=19000;
	public static void main(String arg[]) throws Exception 
	{
		out1	=new BufferedWriter(new FileWriter("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\err.txt"));
		for(int c=35885;c<=35926; c++)
		{
			
		num=c;
		
		try
		{
		 in =new RandomAccessFile("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\IMDB\\"+num+".txt", "r");
		 out	=new BufferedWriter(new FileWriter("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\AttributeFiles\\"+num+".txt"));
		 
		}
		catch(Exception E){
			continue;
		}
		System.out.println(c);
		
		//in.seek(19000);
		try
		{
		title();
		
		ratings();
		
		director();
		
		writers();
		
		cast();
		
		tagline();
		
		genre();
		
		Certification();
		
		WebSite();
		
		Country();
		
		Language();
		
		Release_Date();
		
		Budget();
		
		Revenue();
		
		ProductionCompany();
		
		RunTime();
		
		Color();
		
		AspectRatio();
		
		description();
		//getpos();
		}
		catch(Exception Ex)
		{
			out1.write(""+num+"\n");
		}
		
		


		
		out.close();
		in.close();
		 
		}
		 out1.close();
	}
	private static void AspectRatio() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Aspect Ratio:</h4>"))
			{
				
					sp=S.split("</h4> ");
					
					t1=sp[1];
					
				
				flag=1;
				//System.out.println(t1);
				out.write("Aspect Ratio -> "+t1+"\n");
				
			}
			
		}
		
	}
	private static void Color() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Color:</h4>"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("href"))
				{
					;
				}
				//System.out.println(S);
				
					sp=S.split("\">");
					sp=sp[1].split("<");
					t1=sp[0];
					
				
				flag=1;
				//System.out.println(t1);
				out.write("Color -> "+t1+"\n");
				
			}
			
		}
		
	}
	private static void RunTime() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Runtime:</h4>"))
			{
				//System.out.println(S);
				while(!((S=in.readLine()).contains("min")))
				{
					;
				}
				if(S.contains(":"))
				{
					sp=S.split(": ");
					S=sp[1];
				}
				
				t1=S;
				flag=1;
				//System.out.println(t1);
				out.write("Runtime -> "+t1+"\n");
				
			}
			
		}
		
	}
	
	private static void ProductionCompany() throws Exception{
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Production Co:</h4>"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("href="))
				{
					;
				}
				//System.out.println(S);
				sp=S.split("href=");
				
				for(int p=1; p<sp.length ;p++)
				{
					sp1=sp[p].split("\">");
					sp1=sp1[1].split("<");
					t1=t1+sp1[0]+" ";
				}
				flag=1;
				//System.out.println(t1);
				out.write("Production Company -> "+t1+"\n");
			}
			
		}
		
		
	}
	private static void Revenue() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Gross:</h4>"))
			{
				sp=S.split("</h4> ");
				t1=sp[1];
				flag=1;
				//System.out.println(t1);
				out.write("Revenue -> "+t1+"\n");
				
			}
			
		}
	}
	private static void Budget() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Budget:</h4>"))
			{
				sp=S.split("</h4> ");
				t1=sp[1];
				flag=1;
				//System.out.println(t1);
				out.write("Budget -> "+t1+"\n");
				
			}
			
		}
	}
	
	private static void Release_Date() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Release Date:</h4>"))
			{
				//System.out.println(S);
				while(((S=in.readLine())==null))
				{
					;
				}
				//System.out.println(S);
				t1=S;
				flag=1;
				//System.out.println(t1);
				out.write("Release Date -> "+t1+"\n");
				
			}
			
		}
		
	}
	
	private static void Language() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Language:</h4>"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("href"))
				{
					;
				}
				//System.out.println(S);
				while(!(S).contains("</div>"))
				{
					sp=S.split("\">");
					sp=sp[1].split("<");
					t1=t1+sp[0]+" ";
					S=in.readLine();
					
				}
				flag=1;
				//System.out.println(t1);
				out.write("Language -> "+t1+"\n");
				
			}
			
		}
		
	}
	
	private static void Country() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Country:</h4>"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("href"))
				{
					;
				}
				//System.out.println(S);
				while(!(S).contains("</div>"))
				{
					sp=S.split("\">");
					sp=sp[1].split("<");
					t1=t1+sp[0]+" ";
					S=in.readLine();
					
				}
				flag=1;
				//System.out.println(t1);
				out.write("Country -> "+t1+"\n");
				
			}
			
		}
		
	}
	private static void WebSite() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Official Sites:</h4>"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("href"))
				{
					;
				}
				//System.out.println(S);
				sp=S.split("href=\"");
				sp=sp[1].split("\"");
				t1=sp[0];
				flag=1;
				//System.out.println(t1);
				out.write("Website -> "+t1+"\n");
			}
			
		}
		
	}
	private static void Certification() throws Exception {
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4>Motion Picture Rating"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("Rated"))
				{
					;
				}
				//System.out.println(S);
				sp=S.split(" ");
				
				t1=sp[1];
				flag=1;
				//System.out.println(t1);
				out.write("Certification -> "+t1+"\n");
			}
			
		}
		
	}
	private static void genre() throws Exception{
		in.seek(endcast_pos);
		
		String t1="", sp1[];
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Genres:</h4>"))
			{
				//System.out.println(S);
				while(!(S=in.readLine()).contains("<a href="))
				{
					;
				}
				//System.out.println(S);
				sp=S.split("<a href=");
				
				for(int p=1; p<sp.length ;p++)
				{
					sp1=sp[p].split("/genre/");
					sp1=sp1[1].split("\"");
					t1=t1+sp1[0]+" ";
				}
				flag=1;
				//System.out.println(t1);
				out.write("Genre -> "+t1+"\n");
			}
			
		}
		
		
	}
	private static void tagline()throws Exception {
		in.seek(endcast_pos);
		String t1;
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<h4 class=\"inline\">Taglines:</h4> "))
			{
				while(((S=in.readLine())==null))
				{
					;
				}
				
				t1=S;
				//System.out.println(t1);
				out.write("Tagline -> "+t1+"\n");
				
				flag=1;			
				
			}
			
		}
		
	}
	private static void cast() throws Exception {
		in.seek(19000);
		String t1;
		int flag=0;
		int flag1=0;
		String s="";
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<table class=\"cast_list\">"))
			{
				while(!(S=in.readLine()).contains("</table>"))
				{
					if(S.contains("alt=\""))
					{
						sp=S.split("title=\"");
						//System.out.println(sp[1]);
						sp=sp[1].split("\"");
						
						t1=sp[0];
						s=s+t1+",";
						//System.out.println("T1:  "+name);
						
						
					}
				
				}
				try
				{
				String k=s.substring(0, s.length()-2);
				//System.out.println(k);
				out.write("Cast -> "+k+"\n");
				}catch(Exception StringIndexOutOfBoundsException )
				{
					System.out.println("********************************************************************************");
				}
				
				flag=1;
				endcast_pos=in.getFilePointer();
				
			}		
				
			}
			
		}
		
	
	private static void writers() throws Exception{
		in.seek(19000);
		String t1="";
		int flag=0;
		int flag1=0;
		//int flag2;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("Writers:")||S.contains("Writer:"))
			{
				while(flag1==0 )
				{
					S=in.readLine();
					if(S.contains("<a  href="))
					{
						flag1=1;
					}
				}
				while(S.contains("<a  href="))
				{
					try
					{
				sp=S.split("\">");
				
				sp=sp[1].split("<");
				t1=t1+sp[0]+", ";
				
				//System.out.println(t1);
				
				//out.write("Writers :"+t1+"\n");
				
				flag=1;
					}
					catch(Exception Ex)
					{
						flag=1;
						
						return;
					}
				S=in.readLine();
				}
				out.write("Writers -> "+t1+"\n");
				//System.out.println(t1);
				
			}
			
		}
		
	}
	private static void director() throws Exception {
		in.seek(19000);
		String t1;
		int flag=0;
		int flag1=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("Director:"))
			{
				while(flag1==0 )
				{
					S=in.readLine();
					if(S.contains("<a  href="))
					{
						flag1=1;
					}
				}
				sp=S.split("\">");
				
				sp=sp[1].split("<");
				t1=sp[0];
				
				//System.out.println(t1);
				
				out.write("Director -> "+t1+"\n");
				flag=1;			
				
			}
			
		}
		
	}
	private static void description() throws Exception {
		in.seek(19000);
		String t1 = null;
		int flag=0;
		
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("<p>"))
			{
				S=in.readLine();
				sp=S.split("<p>");
				try
				{
				t1=sp[1];
				}
				catch(Exception ex)
				{
					
				}
				
				//System.out.println(t1);
				
				out.write("Description -> "+t1+"\n");
				flag=1;			
				
			}
			
		}
		
	}
		
	
	private static void ratings() throws IOException {
		in.seek(19000);
		String t1;
		int flag=0;
		String a;
		while(( S=in.readLine())!=null&& flag==0)
		{
			if(S.contains("?link=ratings"))
			{
				
				sp=S.split("vote of ");
				
				sp=sp[1].split("'");
				t1=sp[0];
				sp=sp[1].split(">");
				sp=sp[1].split(" votes");
				a=sp[0];
				//System.out.println(t1+"  "+a);
				out.write("Rating -> "+t1+"  "+a+" votes"+"\n");
				
				flag=1;			
				
			}
			
		}
		
	}
	private static void getpos() throws Exception {
		in =new RandomAccessFile("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\IMDB\\"+num+".txt", "r");
		int flag=0;
		in.seek(19000);
		while(( S=in.readLine())!=null&& flag==0)
		{
			
			if(S.contains("<div id=\"pagecontent\">"))
			{
				System.out.println(in.getFilePointer());
				flag=1;
			}
				
		}
		
	}
	private static void title() throws IOException {
		in.seek(19000);
		String t1;
		int flag=0;
		while(( S=in.readLine())!=null&&flag==0)
		{
			
			if(S.contains("<h1 class=\"header\">"))
			{
				
				//sp=S.split(" \\(");
				//sp=sp[0].split(">");
				//t1=sp[1];
				//System.out.println(t1);
				//System.out.println(in.readLine());
				out.write("Movie -> "+in.readLine()+"\n");
				
				flag=1;			
				
			}
			
		}
		
	}

}
