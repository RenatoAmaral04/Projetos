package exx;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 File file= new File("C:\\temp\\in.txt.txt");
		 Scanner sc = null;
		 try{
		 sc = new Scanner(file);
		 while(sc.hasNextLine()) {
		 System.out.println(sc.nextLine());
		 }
		 } 
		catch(IOException e) {
		 System.out.println("Erroropeningfile: "+ e.getMessage());
		 } 
		finally{
		 if (sc!= null) {
		 sc.close();
		 }
		 }

		 System.out.println("Finally bloco executado");
	}

}
