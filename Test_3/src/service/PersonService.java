package service;

import java.util.List;

import dao.PersonDao;
import entity.TbWaterPerson;

public class PersonService {
	private PersonDao personDao;
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public List<TbWaterPerson> getAll() {
		return personDao.getAll();
	}
	public void delete(Integer id) {
		personDao.delete(id);
	}
	public void save(TbWaterPerson person) {
		personDao.save(person);
	}
}
