package com.ebox;

public class GeneratePalindrome {

	public static void main(String[] args) {
		int n=100;
		generatePal(n);

	}

	private static void generatePal(int n) {
			for(int i=1;i<=n;i++)
			{
				if(isPal(i))
					System.out.println(i+" ");
			}
	}

	private static boolean isPal(int i) {
			StringBuffer sb1 = new StringBuffer();
		return sb1.append(i).toString().equals(sb1.reverse().toString());
	}

}
