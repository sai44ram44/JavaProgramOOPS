package com.naniTech.OOPS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderConcept {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
			FileReader fr = new FileReader("C:\\Users\\padampullaiah\\eclipse-workspace\\JavaProgramsOOPS\\Files\\test.properties");			
			/*int i;
			while((i = fr.read()) != -1) {
				  System.out.println((char)i);
			}	  
		*/
			BufferedReader bf = new BufferedReader(fr);
			String s;
			while((s = bf.readLine())!= null) {
				System.out.println(s);
			}
		

	}

}
