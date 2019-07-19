package com.ebox;

import java.util.Scanner;

public class SeriesPrinting {
		//print series 0  6 10 17 22 30 36
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0,n2=0,a=6,b=4,c1=0,c2=0,num = sc.nextInt();
		if(num>1) {
			System.out.print("0 ");
			for(int i=1;i<=num;i++)
			{
				if(i%2!=0)
				{
					n1=a+c1+n2;
					System.out.print(n1+" ");
					c1++;
				}
				else {
					n2=n1+b+c2;
					System.out.print(n2+" ");
					c2++;
				}
			}
			System.out.println();
		}
		else
			System.out.println("0");
	}

}
