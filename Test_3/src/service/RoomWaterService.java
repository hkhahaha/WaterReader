package service;

import java.util.List;

import dao.RoomWaterDao;
import entity.TbRoomWater;

public class RoomWaterService {
	private RoomWaterDao roomwaterDao;
	public void setRoomWaterDao(RoomWaterDao roomwaterDao) {
		this.roomwaterDao = roomwaterDao;
	}
	public List<TbRoomWater> getAll() {
		return roomwaterDao.getAll();
	}
	public void delete(Integer id) {
		roomwaterDao.delete(id);
	}
	public void save(TbRoomWater tbRoomWater) {
		roomwaterDao.save(tbRoomWater);
	}
}
