package com.batch_2;

import java.util.Arrays;

public class GetCompanyFromString {

	public static void main(String[] args) {
		String emails = "rajesh.t@ibm.co.in,mahesh.m@tesco.com,john.t@bankfee.com,pavan.t@ukdocs.uk,manoj.pvn@ibm.in";
		String arr[] = emails.split(",");
		for (String email : arr) {
			String[] company = email.split("@");
			String e = company[1];
			System.out.println(Arrays.toString(e.split(".")));
		}
	}

}
