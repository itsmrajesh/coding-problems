package com.hackerrank.practice;

public class PlusMinus {

	public static void main(String[] args) {
		int arr[]= {10,25,-5,8,0,-7,55,-4};
		plusMinus(arr);
	}
	
	 static void plusMinus(int[] arr) {
	        int len=arr.length;
	        int positive=0,zero=0,negative=0;
	        for(int i=0;i<len;i++){
	            if(arr[i]<0){
	                negative++;
	            }else if (arr[i]==0){
	                zero++;
	            }
	            else{
	                positive++;
	            }
	        }
	        System.out.println((double)positive/len);
	        System.out.println((double)negative/len);
	        System.out.println((double)zero/len);

	    }

}
