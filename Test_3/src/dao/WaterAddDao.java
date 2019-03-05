package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.TbRoomWater;
import entity.TbSt;

public class WaterAddDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public void save(TbRoomWater tbRoomWater) {
		System.out.println(tbRoomWater.getDate()+"测试位置");
		getSession().saveOrUpdate(tbRoomWater);
	}
}
