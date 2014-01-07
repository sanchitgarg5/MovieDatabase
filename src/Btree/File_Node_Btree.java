package Btree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File_Node_Btree {
	public static int deg; 
	public static void main(String arg[]) throws Exception{
		
		//BufferedWriter out=null;
		BufferedReader inp=new BufferedReader(new FileReader("input.txt"));
		BufferedWriter out= new BufferedWriter(new FileWriter("root.txt"));
		deg=5;
		String s;
		out.write("null");
		out.close();
		while(( s= inp.readLine())!=null)
		{
			int k=Integer.parseInt(s);
			insert(k);
        }
		
	}
	private static void insert(int k) throws Exception{
		BufferedReader inp=new BufferedReader(new FileReader("root.txt"));
		String s;
		int count=0;
		while((s=inp.readLine())!=null){
			count++;
			
		}
		inp.close();
		PrintWriter out=new PrintWriter(new FileWriter("root.txt", true));
		if(count<deg+2){
			out.write(k+" null"+" null");
			
			
		}
		out.close();
	}
}
