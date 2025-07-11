package ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import exx.Product;

public class Programa {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);
		
		Set<Integer> a = new TreeSet<>(Arrays.asList());
		Set<Integer> b = new TreeSet<>(Arrays.asList());
		Set<Integer> C = new TreeSet<>(Arrays.asList());
		
		
		System.out.println("Quantos estudantes tem o curso A");
		int n = ff.nextInt();
		
			for (int i = 0; i <n; i++) {
				
				int num = ff.nextInt();
				a.add(num);
			}
			
			System.out.println("Quantos estudantes tem o curso B");
			int n2 = ff.nextInt();
			
				for (int i = 0; i <n2; i++) {
					
					int num = ff.nextInt();
					a.add(num);
				}
				System.out.println("Quantos estudantes tem o curso C");
				int n3 = ff.nextInt();
				
					for (int i = 0; i <n3; i++) {
						
						int num = ff.nextInt();
						a.add(num);
					}
				
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notbook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notbook", 1200.0);
		System.out.println(set.contains(prod));
		
		//une os dois
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//remove os que não estão nos dois
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//remove os que estão nos dois
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		
	//hashCodeEquals c1 = new hashCodeEquals("Maria", "maria@gmail");
	//hashCodeEquals c2 = new hashCodeEquals("Maria", "maria@gmail");
	}

}
