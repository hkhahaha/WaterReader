package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import entity.TbWaterPerson;

public class WaterDao extends HibernateDaoSupport{

	public TbWaterPerson login(TbWaterPerson tbWaterPerson) {
		String hql="from TbWaterPerson e where username = ? and password = ?";
		System.out.println(tbWaterPerson.getUsername()+"dao");
		System.out.println(tbWaterPerson.getPassword());
		List<TbWaterPerson> list = (List<TbWaterPerson>) this.getHibernateTemplate().find(hql, tbWaterPerson.getUsername(),tbWaterPerson.getPassword());
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
		// TODO 自动生成的方法存根
		
	}
}
