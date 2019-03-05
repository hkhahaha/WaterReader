package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.TbSt;

public class StudentDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<TbSt> getAll() {
		String hql="FROM TbSt e LEFT OUTER JOIN FETCH e.tbRoom";
		System.out.println(hql);
		return getSession().createQuery(hql).list();
	}
	public void delete(Integer id) {
		String hql="delete from TbSt e where e.id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	public void save(TbSt tbSt) {
		getSession().saveOrUpdate(tbSt);
	}
}
