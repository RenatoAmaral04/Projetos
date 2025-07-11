package ex;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exxx.Department;
import exxx.Seller;
import exxx.dao.DaoFactory;
import exxx.dao.SellerDao;

public class Departamento {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
	
	 //Seller seller = new Seller(21,"bob", "bob@gmail", new Date(), 3000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao(); //Uma injeção de dependencia, ele não conhece a implementação, mas só a interface
		System.out.println("\n== TESTE 1: Seller findById == ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n== TESTE 2: Seller findByDepartment == ");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n== TESTE 3: Seller findAll == ");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n== TESTE 4: Seller iNSERT == ");
		Seller newSeller = new Seller(null, "GREG", "greg@greg", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("\n== TESTE 5: Seller UPDATE == ");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n== TESTE 6: Seller DELETED == ");
		System.out.println("Enter id for delete ");
		int id = ff.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed ");
		
		ff.close();
		
	}

}
