package action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbRoomWater;
import service.RoomService;
import service.WaterAddService;

public class WaterAddAction extends ActionSupport implements RequestAware,ModelDriven<TbRoomWater>,Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WaterAddService waterAddService;
	public void setWaterAddService(WaterAddService waterAddService) {
		this.waterAddService = waterAddService;
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}

	private RoomService roomService;
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	public String input() {
		request.put("room", roomService.getAll());
		return INPUT;
	}
	public String save() {
		System.out.println(model);
		waterAddService.save(model);
		return SUCCESS;
	}
	public void prepareSave() {
		model = new TbRoomWater();
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
	private TbRoomWater model;
	@Override
	public TbRoomWater getModel() {
		// TODO 自动生成的方法存根
		return model;
	}
}
