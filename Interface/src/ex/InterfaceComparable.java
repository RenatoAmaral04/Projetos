			package ex;
			
			import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exx.Employee;
			
public class InterfaceComparable {
	public static void main(String[] args) {
					
			List<Employee> list= new ArrayList<>();
			
			String path= "C:\\temp\\in1.txt";
			
			try(BufferedReader br = new BufferedReader(new FileReader(path))) {
				
			String employeeCsv = br.readLine();
			while (employeeCsv!= null) {
				
			String [] fields = employeeCsv.split(",");
			list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
			employeeCsv= br.readLine();
			
			}
			
			Collections.sort(list); //Ordena uma coleção
			for(Employee s: list) {
			System.out.println(s.getName()+ ", " + s.getSalary());
			}
			
			} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			}
			}
			}