
//GENERATING A RANDON STRING
package Strings;

public class GenerateRandomString_GivenLength {

	public static void main(String[] args) {
	  int n=20;
	  
	  String sb=rrandom(n);
	  System.out.println("the randim string generated is...."+sb);
	}
	public static String rrandom(int n)
	{
		String AlphNumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
            
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++)
		{
			int index=(int)(AlphNumeric.length()*Math.random());
			sb.append(AlphNumeric.charAt(index));
		}
		return sb.toString();
	}

}
