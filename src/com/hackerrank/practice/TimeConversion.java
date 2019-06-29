package com.hackerrank.practice;

public class TimeConversion {

	public static void main(String[] args) {
		String unFormattedTime="07:45:05PM"; //check this also 12:12:12AM
		String formattedTime=timeConversion(unFormattedTime);
		System.out.println(formattedTime);

	}
	
	  static String timeConversion(String s) {
	        String[] datas=s.split(":");
	        String hour=datas[0],minute=datas[1],seconds=datas[2];
	        String amOrpm=datas[2].substring(2);
	        int hourInt=Integer.parseInt(hour);
	        if(amOrpm.equals("PM")){
	            if(hourInt==12){
	                hour="12";
	            }else if(hourInt < 12){
	                hourInt = hourInt+12;
	                hour=""+hourInt;
	            }
	        }
	        else if (amOrpm.equals("AM")){
	            if(hourInt==12){
	                hour="00";
	            }else if(hourInt > 12){
	                 hourInt = hourInt-12;
	                hour=""+hourInt;
	            }

	        }
	        String formatedTime = hour+":"+minute+":"+seconds.substring(0,2);
	        return formatedTime;

	    }

}
