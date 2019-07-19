package com.ebox;


import java.util.*;

public class Land{
		public static void main(String args[]){
		int field;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0 && n%3==0)
		{
			
				field=n/3;
				System.out.println(field +" "+field+" "+field);
			
			
		}
		else {
			System.out.println("NO");
		}
	
}

}