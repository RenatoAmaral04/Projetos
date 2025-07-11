package ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File4 {

	public static void main(String[] args) {

		
		Scanner ff = new Scanner(System.in);
		String strP = ff.nextLine();
		
		File path = new File (strP);
		File[] folders = path.listFiles(File::isDirectory); //função que especifica o que eu quero filtrar, lista somente o que é diretório ou pasta
		
		System.out.println("FOLDERS: ");
		
		for (File folder : folders) {
			
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); //LISTAR OS ARQUIVOS
		System.out.println("FILES: ");
		
		for (File file : files) {
			
			System.out.println(file);
		}
		
		boolean sucess = new File(strP + "\\out").mkdir(); //CRIAR subpastas a partir da minha pasta
		
		String[] lines = new String[] {"TV LED, 1290.99, 1", "Video Game Chair, 350.50, 3", "Iphone x, 900.00, 2", "Samsung Galaxy 9, 850.00, 2"};

		String path1 = "C:\\temp\\produtos1.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path1))){
			
			for (String line : lines) {
				
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e ) {
			
			e.printStackTrace();
		
		System.out.println("Directory successfully: " + sucess);
		System.out.println("Nome: " + path.getName());
		System.out.println("Diretório: " + path.getParent());
		ff.close();
	}
	}
}
