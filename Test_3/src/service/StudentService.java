package service;

import java.util.List;

import dao.StudentDao;
import entity.TbSt;

public class StudentService {
	private StudentDao studentDao;
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public List<TbSt> getAll() {
		return studentDao.getAll();
	}
	public void delete(Integer id) {
		studentDao.delete(id);
	}
	public void save(TbSt tbSt) {
		studentDao.save(tbSt);
	}
}
