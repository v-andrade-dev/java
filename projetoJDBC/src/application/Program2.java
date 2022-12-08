package application;

import java.util.List;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentDao departmentDao  = FactoryDao.createDepartmentDao();
		
		System.out.println("\n==== TESTE 1 insert ======");
		Department dept = new Department(6, "Misc");
		departmentDao.insert(dept);

		
		//System.out.println("Inserted seller! id: "+ dept.getId());
		
		System.out.println("\n==== TESTE 2 update ======");
		//dept.setName("Junk");
		//departmentDao.update(dept);
		//dept.setId(6);
		//departmentDao.update(dept);
		System.out.println("Updade complete!");
		
		/*System.out.println("\n==== TESTE 3 delete ======");
		departmentDao.deleteById(9);
		System.out.println("Delete complete!");
		
		System.out.println("\n==== TESTE 4 findById ======");
		dept = departmentDao.findById(15);
		System.out.println(dept);
		*/
		System.out.println("\n==== TESTE 5 findAll ======");
		List<Department>list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}

	}

}
