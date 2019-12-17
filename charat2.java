package Strings;

import java.util.Scanner;

public class charat2 {

	public static void main(String[] args)  throws Numberexceeds{
		// TODO Auto-generated method stub
         String s="htderabad";
         Scanner sc=new Scanner(System.in);
         System.out.println("enter index");
         try {
         int index=sc.nextInt();
        
         char []ch=s.toCharArray();
         if(index<0||index>ch.length)
        	 throw new Numberexceeds("pls enter range number");
         System.out.println(ch[index]);
         }
         catch(Exception e) {System.out.println(e);}
	}

}
class Numberexceeds extends Exception
{
	Numberexceeds(String s)
	{
		super(s);
		
	}
}
