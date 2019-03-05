package action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbAdmin;
import entity.TbWaterPerson;
import service.AdminService;
import service.CycleService;
import service.RoomService;
import service.WaterService;
import util.SecurityAdd;

public class AdminAction extends ActionSupport implements ModelDriven<TbAdmin>,RequestAware,Preparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String login() {
		System.out.println(tbAdmin.getUsername()+"action");
		SecurityAdd securityAdd = new SecurityAdd();
		tbAdmin.setPassword(securityAdd.setSecurityPassword(tbAdmin.getPassword()));
		TbAdmin man=adminService.login(tbAdmin);
		if (man==null) {
			this.addActionError("用户名或者密码错误");
			return INPUT;
		}else {
			return SUCCESS;
		}
	}
	
	private TbAdmin tbAdmin = new TbAdmin();
	@Override
	public TbAdmin getModel() {
		// TODO 自动生成的方法存根
		return tbAdmin;
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
