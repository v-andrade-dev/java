package application;

import java.util.Date;
import java.util.List;

import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellerDao sellerDao = FactoryDao.createSellerDao();
		
		System.out.println("==== TESTE 1 findById ======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
				
		System.out.println("\n==== TESTE 2 findByDepartment ======");
		Department dept = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dept);
		for(Seller obj: list) {
			System.out.println(obj);
		}

		System.out.println("\n==== TESTE 3 findAll ======");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TESTE 4 insert ======");
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dept);
		//sellerDao.insert(newSeller);
		
		//System.out.println("Inserted seller! id: "+ newSeller.getId());
		
		System.out.println("\n==== TESTE 5 update ======");
		seller = sellerDao.findById(8);
		seller.setName("Martha Purple");
		sellerDao.update(seller);
		System.out.println("Updade complete!");
		
		System.out.println("\n==== TESTE 6 delete ======");
		sellerDao.deleteById(9);
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
	}

}
