package ex;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\prdutos.csv");
		Scanner ff = null;
		
		try {
			
			ff = new Scanner(file);
			while(ff.hasNextLine()) {
				
				System.out.println(ff.nextLine());
				}
			}
			catch(IOException e) {
				System.out.println("error" + e.getMessage());
			}
		finally {
			if(ff != null) {
				ff.close();
			}
		}	
	}

}
