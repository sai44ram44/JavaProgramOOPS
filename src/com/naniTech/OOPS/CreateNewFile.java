package com.naniTech.OOPS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\padampullaiah\\eclipse-workspace\\JavaProgramsOOPS\\Files\\test.properties");
		try {
			if(!f.exists())
			f.createNewFile();
			System.out.println("File Succesfully Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//write something inside a file
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Name=Vamsi");
			fw.flush();
			System.out.println("Successfully write in the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
