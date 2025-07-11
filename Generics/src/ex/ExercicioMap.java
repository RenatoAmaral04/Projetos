package ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class ExercicioMap {

	public static void main(String[] args) {

		String path = "C:\\temp\\in.txt";
		Map<String, Integer> set = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String username = fields[0];
				Integer quantidade = Integer.valueOf(fields[1]);

				if (set.containsKey(username)) { //verifica se o nome ja existe

					int votos = set.get(username); //recebe o nome do candidato
					set.put(username, quantidade + votos); //se ja teve votos, lhe é adicxionado mais

				} else {
					set.put(username, quantidade);
				}

				line = br.readLine();
			}
			for (String inta : set.keySet()) {

				System.out.println(inta + ": " + set.get(inta));
			}

		} catch (IOException e) {

			System.out.println("Error:  " + e.getMessage());
		}

	}

}
