package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbWaterCycle;
import service.RoomService;
import service.CycleService;

public class CycleAction extends ActionSupport implements RequestAware,ModelDriven<TbWaterCycle>,Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CycleService cycleService;
	public void setCycleService(CycleService cycleService) {
		this.cycleService = cycleService;
	}
	public String list(){
		request.put("cycle", cycleService.getAll());
		System.out.println(request.put("cycle", cycleService.getAll()).toString());
		return "list";
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}

	public String delete() {
		cycleService.delete(id);
		return "delete";
	}
	public String input() {
		return INPUT;
	}
	public String save() {
		System.out.println(model);
		cycleService.save(model);
		return SUCCESS;
	}
	public void prepareSave() {
		model = new TbWaterCycle();
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
	private TbWaterCycle model;
	@Override
	public TbWaterCycle getModel() {
		// TODO 自动生成的方法存根
		return model;
	}
}
