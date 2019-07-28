package com.tcs;

public class Series {

	public static void main(String[] args) {
		// 3,3,9,9,15,27,21,81,27
		
		// 3 9 15 21 27 33 39  Observe all are in AP with difference = 6
		// 3 9 27 81 243 729  Observe all in GP with common ration = 3 
		
		int n=10,ap=3,gp=3;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(gp);
				gp *=3;
			}
			else {
				System.out.println(ap);
				ap += 6;
			}
		}
		
	}

}
