package APP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;
import entities.SHAPE;
import entities1.ENUM;

public class CircleRetangle {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		List<SHAPE> list = new ArrayList<>();

		System.out.println("Digite o numero de figuras");
		int n = ff.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("FIGURA #" + i);
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char ch = ff.next().charAt(0);
			System.out.print("COR É (BLACK/ BLUE / RED)? ");
			ENUM color = ENUM.valueOf(ff.next());

			if (ch == 'r') {

				System.out.print("Widht: ");
				double widht = ff.nextDouble();
				System.out.print("Height: ");
				double height = ff.nextDouble();
				list.add(new Retangulo(color, widht, height));
			} else {

				System.out.print("radius: ");
				double radius = ff.nextDouble();
				list.add(new Circulo(color, radius));
			}
		}
		System.out.println();

		for (SHAPE result : list) {

			System.out.println(String.format("%.2f", result.area()));
		}

		ff.close();
	}

}
