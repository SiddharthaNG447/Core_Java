package Strings;

public class convert_lower_to_higher_case {
	public static void main(String[] args)
	{
	
	String s="greKJat pOoHwer";
	StringBuffer sb=new StringBuffer(s);
	
	for(int i=0;i<s.length();i++)
	{
		if(Character.isLowerCase(s.charAt(i)))
		{
			sb.setCharAt(i,Character.toUpperCase(s.charAt(i)));
	      }
		
		if(Character.isUpperCase(s.charAt(i)))
		{
			sb.setCharAt(i,Character.toLowerCase(s.charAt(i)));
	      }
	}
	System.out.println(sb);


}
}
