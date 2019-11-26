package arrays;

import java.util.Scanner;

public class Arraycountfour {
public static void main(String[] ar5gs){
	int[] i=new int[4];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int sum=s.nextInt();
	s.close();
	int n=0;;
	for(int a=0;a<10;a++) {
		i[0]=a;
		for(int b=0;b<10;b++) {
			i[1]=b;
			for(int c=0;c<10;c++) {
				i[2]=c;
				for(int d=0;d<10;d++) {
					i[3]=d;n=0;
					for (int k=0;k<i.length;k++) {
						n=n+i[k];
					}
					if(n==sum) {
						System.out.println(i[0]+""+i[1]+""+i[2]+""+i[3]);
					}
				}	
			}	
		}	
	}
}}