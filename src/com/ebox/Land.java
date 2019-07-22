package com.ebox;


import java.util.*;

public class Land{
		public static void main(String args[]){
		int field;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			if(n%3==0) {
				field=n/3;
				System.out.println(field +" "+field+" "+field);
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}
	
}
		
		public void disp() {
			System.out.println("hello");
		}

}