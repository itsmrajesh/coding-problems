package com.techgig;

/* Read input from STDIN. Print your output to STDOUT*/
/*Read two strings check count of second string in first string 
 * Ex:
 * Input :-
 * Apple is lovele
 * le
 * 
 * Output:
 * 2
 * */


import java.io.*;
import java.util.*;
public class SubStringCount {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String sub = sc.next();
      int count=0, m = s.length(),n=sub.length();
      for(int i=0;i<=m-n;i++){
    	  String ss=s.substring(i,i+n);
         if(sub.equals(ss))
            count++;
      }
      System.out.print(count);
   }
}

