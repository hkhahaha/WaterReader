package action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbRoom;
import service.RoomService;

public class RoomAction extends ActionSupport implements RequestAware,ModelDriven<TbRoom>,Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RoomService roomService;
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	public String list(){
		request.put("room", roomService.getAll());
		System.out.println("Action中的测试位置************");
		return "list";
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}
	public String delete() {
		roomService.delete(id);
		return "delete";
	}
	
	public String input() {
		request.put("room", roomService.getAll());
		return INPUT;
	}
	public String save() {
		System.out.println(model);
		roomService.save(model);
		return SUCCESS;
	}
	public void prepareSave() {
		model = new TbRoom();
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
	private TbRoom model;
	@Override
	public TbRoom getModel() {
		// TODO 自动生成的方法存根
		return model;
	}
}
