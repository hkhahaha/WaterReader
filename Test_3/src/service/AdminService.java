package service;

import dao.AdminDao;
import entity.TbAdmin;

public class AdminService {
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	public TbAdmin login(TbAdmin tbAdmin) {
		System.out.println(tbAdmin.getUsername()+"service");
		System.out.println(tbAdmin.getPassword()+"service");
		// TODO 自动生成的方法存根
		TbAdmin man=adminDao.login(tbAdmin);
		return man;
	}
}
