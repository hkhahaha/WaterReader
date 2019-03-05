package dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import entity.TbAdmin;

public class AdminDao extends HibernateDaoSupport{

	public TbAdmin login(TbAdmin tbAdmin) {
		String hql="from TbAdmin e where username = ? and password = ?";
		System.out.println(tbAdmin.getUsername()+"dao");
		System.out.println(tbAdmin.getPassword()+"dao");
		List<TbAdmin> list = (List<TbAdmin>) this.getHibernateTemplate().find(hql, tbAdmin.getUsername(),tbAdmin.getPassword());
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
		// TODO 自动生成的方法存根
		
	}
}
