package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import exx.Product1;

public class ExercicioFinal {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		
		String path = "C:\\Temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product1> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product1(fields[0],fields[1] ,Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Digite o salairo: ");
			double salario = ff.nextDouble();
			
			List<String> emails = list.stream() // separo em uma stream
					.filter(x -> x.getSalario() > salario) //filtro os salarios que são maiores do que o que eu digitei
					.map(x -> x.getEmail()) // vejo os emails das pessoas que tem esse salario
					.sorted() //ordena em ordem alfabética
					.collect(Collectors.toList()); //Coloca em uma lista na ordem para exibir
			
			System.out.println("Email das pessoas que recebem mais de " + String.format("%.2f ", salario));
			emails.forEach(System.out::println);
			
			double soma = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M') //filtra os nomes com M
					.map(x -> x.getSalario()) //Ve o salario dessas pessoas
					.reduce(0.0, (x,y) -> x + y); //objeto começa com 0 depis conforme for percorrendo a lista, vai somando
			
		System.out.println("Soma dos salario das pessoas que tem a letra 'M': " + String.format("%.2f", soma));
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
