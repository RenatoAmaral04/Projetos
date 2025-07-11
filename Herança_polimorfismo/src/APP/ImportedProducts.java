package APP;
import entities.Product;
import entities.Employee;
import entities.ImportedProduct;
import entities.UsedProduct;
import java.util.Scanner;
import java.util.List;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;

public class ImportedProducts {

	public static void main(String[] args) throws ParseException {
		
		Scanner ff = new Scanner(System.in);
		
		List<Product> prod = new ArrayList<>();
		

		System.out.print("Digite Quantos produtos: ");
		int n = ff.nextInt(); 
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("Produto #" + i);
			System.out.print("O produto é importado, usado ou novo (n/u/i): ");
			char item = ff.next().charAt(0);
			ff.nextLine();
			System.out.print("Name: ");
			String name = ff.nextLine();
			ff.nextLine();
			System.out.print("Preço: ");
			double preco = ff.nextDouble();
			
			if (item == 'n' ||item == 'N') {
				
				prod.add(new Product(name, preco));
			}
			else if (item == 'u' ||item == 'U') {
				
				System.out.print("Data de fabricação (dd/mm/aaaa): ");
				LocalDate data = LocalDate.parse(ff.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				prod.add(new UsedProduct(name, preco, data));
			}
			
			else {
				
				System.out.print("valor da taxa: ");
				double taxa = ff.nextDouble()
;				prod.add(new ImportedProduct(name, preco, taxa));
			}
			
		}
		
		System.out.println();
		
		System.out.println("Preço final");
	
		for (Product emp : prod) {
			
			System.out.println(emp.toString());
		}
			
ff.close();

	}
	}
