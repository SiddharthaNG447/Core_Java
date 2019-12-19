package Strings;

import java.util.HashSet;

public class permutation_string2 {
	public static void main(String[] args)
	{
			String s="abcd";
			HashSet h1=new HashSet();
			for(int i=0;i<s.length();i++) {
			
	                   String temp=""+s.charAt(i);

	                   String temp1=""+s.charAt(i);

			for(int j=0;j<s.length();j++) {

				if(i==j)
					continue;
				temp=temp+s.charAt(j);
			}
			h1.add(temp);
			for(int k=s.length()-1;k>=0;k--) {
				if(i==k)
					continue;
				temp1=temp1+s.charAt(k);
			}
			h1.add(temp1);
			}
			
			
		System.out.print(h1);
		}
	}




