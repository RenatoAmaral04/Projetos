package ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File3 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"TV LED, 1290.99,1", "Video Game Chair, 350.50,3", "Iphone x, 900.00,2", "Samsung Galaxy 9, 850.00,2"};

		String path = "C:\\temp\\produtos1.csv"; // estou instanciando o nome que meu arquivo vai ter, o tipo e o caminho a ser salvo
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String line : lines) {
				
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e ) {
			
			e.printStackTrace();
		}
	}

}
