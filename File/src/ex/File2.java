package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) {
	
		String path = "C:\\Temp\\produtos.csv";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
		
			String line = br.readLine();
			
			while (line != null) {
			
				System.out.println(line);
				line = br.readLine();
		}
		
			} catch(IOException e ) {
			System.out.println("Error " + e.getMessage());
		}
}
}