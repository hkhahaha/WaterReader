package service;

import dao.WaterAddDao;
import entity.TbRoomWater;

public class WaterAddService {
	private WaterAddDao waterAddDao;
	public void setWaterAddDao(WaterAddDao waterAddDao) {
		this.waterAddDao = waterAddDao;
	}
	public void save(TbRoomWater tbRoomWater) {
		waterAddDao.save(tbRoomWater);
	}
}
