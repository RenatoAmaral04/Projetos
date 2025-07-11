package exxx.dao;

import db.DB;
import exxx.dao.imple.DepartmentDaoJDBC;
import exxx.dao.imple.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
