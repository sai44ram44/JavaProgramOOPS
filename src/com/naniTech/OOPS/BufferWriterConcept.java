package com.naniTech.OOPS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterConcept {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\padampullaiah\\eclipse-workspace"
					+ "\\JavaProgramsOOPS\\Files\\test.properties");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Name=Sairam");
			bw.newLine();
			bw.write("Age=20");
			bw.newLine();
			bw.write("Designation=TestAutomation");
			bw.flush();
			System.out.println("Write to file successful");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
