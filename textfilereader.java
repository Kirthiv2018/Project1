package javabasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textfilereader {

	public static void main(String[] args) throws IOException {

	     String file ="fileTest.txt";
	     
	     BufferedReader reader = new BufferedReader(new FileReader(file));
	     String currentLine = reader.readLine();
	     System.out.println(currentLine);
	     reader.close();
		
		
	}

}
