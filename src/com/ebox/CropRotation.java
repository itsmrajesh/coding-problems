package com.ebox;

import java.util.Scanner;

public class CropRotation {

	public static void main(String[] args) {
			String arr[]= {"Winter wheat","Beans","Left Fallow"};
			Scanner sc = new Scanner(System.in);
			int dur=sc.nextInt(),field=sc.nextInt();
			
			if(dur>=1 && dur<=4)
			{
				System.out.println(arr[field-1]);
			}
			else if (dur>=5 && dur <= 8)
			{
				rotateArrToRight(arr,1);
				System.out.println(arr[field-1]);
			}
			else if (dur>=9 && dur <=12){
				rotateArrToRight(arr,2);
				System.out.println(arr[field-1]);
			}
			sc.close();
	}

	private static void rotateArrToRight(String[] arr, int times) {
			for(int i=0;i<times;i++)
			{	
				int j,len=arr.length;
				String temp=arr[len-1];
				for(j=len-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[j]=temp;
				
			}
		
	}

}
