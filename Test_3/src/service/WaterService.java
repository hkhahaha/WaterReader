package service;

import dao.WaterDao;
import entity.TbWaterPerson;

public class WaterService {
	private WaterDao waterDao;
	public void setWaterDao(WaterDao waterDao) {
		this.waterDao = waterDao;
	}
	public TbWaterPerson login(TbWaterPerson tbWaterPerson) {
		System.out.println(tbWaterPerson.getUsername()+"service");
		// TODO 自动生成的方法存根
		TbWaterPerson man=waterDao.login(tbWaterPerson);
		return man;
	}
}
