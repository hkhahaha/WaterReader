package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.TbWaterPerson;

public class PersonDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<TbWaterPerson> getAll() {
		String hql="FROM TbWaterPerson e";
		System.out.println(hql);
		return getSession().createQuery(hql).list();
	}
	public void delete(Integer id) {
		String hql="delete from TbWaterPerson e where e.id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	public void save(TbWaterPerson tbWaterPerson) {
		getSession().saveOrUpdate(tbWaterPerson);
	}
}
