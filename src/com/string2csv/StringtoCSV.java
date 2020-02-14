package com.string2csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class StringtoCSV {
	
	//Program to split names with , and write those names into .csv file

	/*
	 * Download OpenCSV dependency .jar file from:-
	 * https://mvnrepository.com/artifact/com.opencsv/opencsv/4.0
	 */

	public static void main(String[] args) {
		/*
		 * provide your .csv file path here or provide directory with name of the file
		 * which you want to create, it will create file into that directory.
		 */
		String filePath = "M:\\names.csv";
		Scanner sc = new Scanner(System.in);
		/*
		 * enter names separated by ',' [ex: ram krishna,lakshman,rakesh nalla,lokesh
		 * and press enter]
		 */
		String names = sc.nextLine();
		sc.close();
		String[] namesArr = names.split(",");
		writeDataLineByLine(filePath, namesArr);
	}

	public static void writeDataLineByLine(String filePath, String[] namesArr) {
		// first create file object for file placed at location
		// specified by filepath
		File file = new File(filePath);
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			List<String[]> names = new ArrayList<>();
			String[] header = { "Names" }; //Header for CSV File
			names.add(header);
			names.add(namesArr);
			writer.writeAll(names);
			System.out.println("Data Succesfully inserted to CSV File");
			// closing writer connection
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while insering data to CSV File");
			System.out.println("Error : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
