package ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>(Arrays.asList(21,35,22));
		Set<Integer> b = new HashSet<>(Arrays.asList(21,50));
		Set<Integer> c = new HashSet<>(Arrays.asList(42,35,13));

			Set<Integer> d = new TreeSet<>(a);
			d.addAll(b);
			d.addAll(c);
			System.out.println("Total de estudantes: " + d.size());
	}

}
