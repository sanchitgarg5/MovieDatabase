package DataExtraction;

import java.io.*;

public class MissingFileFinder {
	
	public static void main(String arg[])
	{
		for(int num=1; num<=35927; num++)
		{
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Sanchit Garg\\Desktop\\Projects\\DBMS\\IMDB\\"+num+".txt"));
		//br.close();
		
		} catch (Exception e) {
			System.out.println("-----------------------------------------------------------------------"+num);
		}
	//	System.out.println(num);
		
		
		}
		
	}

}
