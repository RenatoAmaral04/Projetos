package APP;

import java.util.Scanner;
import java.util.ArrayList;
import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Digite quantos funcionários ");
		int n = ff.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Contrato # " + i + " data");

			System.out.print("Funcionario é tercerizado? y/n ");
			char op = ff.next().charAt(0);
			System.out.print("Nome: ");
			ff.nextLine();
			String name = ff.nextLine();
			System.out.print("Horas: ");
			int horas = ff.nextInt();
			System.out.print("Valor por hora: ");
			double valorH = ff.nextDouble();
		

			if (op == 'y' || op == 'Y') {

				
				System.out.print("Adicional: ");
				double add = ff.nextDouble();
				Employee pj = new OutsourcedEmployee(name, horas, valorH, add);
				list.add(pj);
			} else {

				Employee clt = new Employee(name, horas, valorH);
				list.add(clt);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS");

		for (Employee emp : list) {

			System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
		}
	}

}
