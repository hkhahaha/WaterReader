package action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbWaterPerson;
import service.CycleService;
import service.RoomService;
import service.WaterService;
import util.SecurityAdd;

public class WaterAction extends ActionSupport implements ModelDriven<TbWaterPerson>,RequestAware,Preparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WaterService waterService;
	public void setWaterService(WaterService waterService) {
		this.waterService = waterService;
	}
	public String login() {
		System.out.println(tbWaterPerson.getUsername()+"action");
		SecurityAdd securityAdd = new SecurityAdd();
		tbWaterPerson.setPassword(securityAdd.setSecurityPassword(tbWaterPerson.getPassword()));
		TbWaterPerson man=waterService.login(tbWaterPerson);
		if (man==null) {
			this.addActionError("用户名或者密码错误");
			return INPUT;
		}else {
			/**
			 * 修改时间：2019-3-1
			 * 原因：添加查询date、room
			 */
			request.put("room", roomService.getAll());
			request.put("cycle", cycleService.getAll());
			return SUCCESS;
		}
	}
	private CycleService cycleService;
	public void setCycleService(CycleService cycleService) {
		this.cycleService = cycleService;
	}
	private RoomService roomService;
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	private TbWaterPerson tbWaterPerson = new TbWaterPerson();
	@Override
	public TbWaterPerson getModel() {
		// TODO 自动生成的方法存根
		return tbWaterPerson;
	}
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO 自动生成的方法存根
		this.request=arg0;
	}
	@Override
	public void prepare() throws Exception {
		// TODO 自动生成的方法存根
		
	}


}
