package com.batch_2;


public class GetCompanyFromString {

	public static void main(String[] args) {
		String emails = "rajesh.t@ibm.co.in,mahesh.m@tesco.com,john.t@bankfee.com,pavan.t@ukdocs.uk,manoj.pvn@ibm.in";
		String arr[] = emails.split(",");
		for (String email : arr) {
			String[] company = email.split("@");
			String companyName = company[1].split("\\.")[0]; // spliting with . should be replace with \\.
			System.out.println(companyName);
		}

	}

}
