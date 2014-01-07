package Btree;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Btree {
	public static int deg;
	 
	public static void main(String arg[]) throws Exception{
		
		BufferedReader inp=new BufferedReader(new FileReader("input.txt"));
		
		 deg=5;
		String s;
		Node root[]=new Node[deg];
		int c=0;
		
		for(int i=0; i<deg; i++)
		{
			root[i]=new Node(-1);
		}
		
		
		while(( s= inp.readLine())!=null)
		{//System.out.println(c);
			int k=Integer.parseInt(s);
			
			if(c<5)
			{
				root[c].value=k;
				c++;		
				
				root=sort(root);
				
			}
			
			else
			{
				//split();
			}
			
			
		}
		for(int i=0; i<deg; i++)
		System.out.println(root[i].value);
		/*Node a1[]= new Node[5];
		Node a2[]= new Node[5];
		Node a3[]= new Node[5];
		
		a1[0].left=a2[0];
		a1[0].right=a3[0];
		
		a1[0].value=5;*/
		
		
		
		
		
		 
		 
	}

	private static Node[] sort(Node[] root) 
	{
		Node [] temp= root;
		int i=0;
		int ct=0;
		System.out.println(deg);
		while(ct<deg&&root[i].value!=-1)
		{
			ct++;
			i++;
		}
		//System.out.println(ct);
		Integer A[]=new Integer[ct];
		for(int l=0; l<ct; l++)
		{
			A[l]=root[l].value;
		}
		int t=0;
		for(int x=0; x<A.length-1; x++)
		{
			for(int y=x+1; y<A.length; y++)
			{
				if(A[x]>A[y])
				{
					 t=A[x];
				A[x]=A[y];
				A[y]=t;
				}
			}
		}
		
		for(int z=0; z<ct; z++)
		{
			root[z].value=A[z];
		}
		
		return root;
	}

}
