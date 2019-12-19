package Strings;

public class words_palidrome_check {
	public static void main(String[] args)
	{
	
	String str="abdc deed avr arra";
	String[] s=str.split("\\s");

	  int len=s.length;
	  for(int i=0;i<len;i++)
	  {
		  String word=" ";
		  word=s[i];
		  String revword="";
		 for(int j=word.length()-1;j>=0;j--)
		 {
			 revword+=word.charAt(j);
		 }
		 if(word.equals(revword))
		 {
			 System.out.println(s[i]);
		 }
			 
	  }
	
	
	
	
	
	
	
	
	
}
}