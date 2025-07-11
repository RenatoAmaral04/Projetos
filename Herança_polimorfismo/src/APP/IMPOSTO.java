package APP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.IR;
import entities.PF;
import entities.PJ;

public class IMPOSTO {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		List<IR> list1 = new ArrayList<>();
		System.out.print("QUANTOS IMPOSTOS SERÃO CALCULADOS: ");
		int n = ff.nextInt();
		
		
		for (int i = 1; i<=n; i++) {
			
		System.out.print("PESSOA FISICA OU JURIDICA?: (pf/pj) ");
		char p = ff.next().charAt(1);
		ff.nextLine();
		
		System.out.print("Digite o nome: ");
		String name = ff.nextLine();
		
		System.out.print("Digite a renda: ");
		double renda = ff.nextDouble();
		
		
		if(p == 'f') {
			
			System.out.print("Digite o gasto com saude: ");
			double saude = ff.nextDouble();
			list1.add(new PF(name, renda, saude));
		}else {
			
			System.out.print("Digite quantos funcionários: ");
			int func = ff.nextInt();
			list1.add(new PJ(name, renda, func));
		}
		}
		
		double total = 0;
		for (IR tax : list1) {
			
			System.out.println(tax.getName()  + ": $ " + String.format("%.2f" , tax.tax()));
			total += tax.tax();
		}
		
		System.out.println("TOTAL DE TAXAS: " + total);
	}

}
