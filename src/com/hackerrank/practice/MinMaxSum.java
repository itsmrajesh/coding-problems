package com.hackerrank.practice;

import java.util.*;

public class MinMaxSum {

	public static void main(String[] args) {
		int arr[]= {10,25,5,8,0,7,55,4};
		miniMaxSum(arr);
	}
	
	static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min=arr[0],sum=0;
        int len=arr.length;
        int maxElementIndex=len-1;
        long max=arr[maxElementIndex];
       
        for(int i : arr){
            sum += i;
        }
        long minimum=sum-max;
        long maximum=sum-min;
        System.out.print(minimum+" "+maximum);

        

    }

}
