package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.TbRoom;

public class RoomDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<TbRoom> getAll(){
		String hql="from TbRoom e";
		return getSession().createQuery(hql).list();
	}
	public void delete(Integer id) {
		String hql="delete from TbRoom e where e.id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	public void save(TbRoom tbRoom) {
		getSession().saveOrUpdate(tbRoom);
	}
}
