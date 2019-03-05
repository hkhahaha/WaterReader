package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.TbRoomWater;
import entity.TbSt;

public class RoomWaterDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<TbRoomWater> getAll() {
		String hql="FROM TbRoomWater e LEFT OUTER JOIN FETCH e.tbRoom";
		System.out.println(hql);
		return getSession().createQuery(hql).list();
	}
	public void delete(Integer id) {
		String hql="delete from TbRoomWater e where e.id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	public void save(TbRoomWater tbRoomWater) {
		getSession().saveOrUpdate(tbRoomWater);
	}
}
