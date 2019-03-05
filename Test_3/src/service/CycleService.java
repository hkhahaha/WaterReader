package service;

import java.util.List;

import dao.CycleDao;
import entity.TbWaterCycle;

public class CycleService {
	private CycleDao cycleDao;
	public void setCycleDao(CycleDao cycleDao) {
		this.cycleDao = cycleDao;
	}
	public List<TbWaterCycle> getAll() {
		return cycleDao.getAll();
	}
	public void delete(Integer id) {
		cycleDao.delete(id);
	}
	public void save(TbWaterCycle tbSt) {
		cycleDao.save(tbSt);
	}
}
