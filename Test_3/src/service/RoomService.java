package service;

import java.util.List;

import dao.RoomDao;
import entity.TbRoom;

public class RoomService {
	private RoomDao roomDao;
	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}
	public List<TbRoom> getAll() {
		return roomDao.getAll();
	}
	public void delete(Integer id) {
		roomDao.delete(id);
	}
	public void save(TbRoom tbRoom) {
		roomDao.save(tbRoom);
	}
}
