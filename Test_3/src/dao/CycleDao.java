package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.TbWaterCycle;

public class CycleDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<TbWaterCycle> getAll() {
		String hql="FROM TbWaterCycle e";
		System.out.println(hql);
		return getSession().createQuery(hql).list();
	}
	public void delete(Integer id) {
		String hql="delete from TbWaterCycle e where e.id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	public void save(TbWaterCycle tbWaterCycle) {
		getSession().saveOrUpdate(tbWaterCycle);
	}
}
