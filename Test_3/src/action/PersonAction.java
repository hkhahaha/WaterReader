package action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbWaterPerson;
import service.PersonService;
import util.SecurityAdd;

public class PersonAction extends ActionSupport implements RequestAware,ModelDriven<TbWaterPerson>,Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonService personService;
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public String list(){
		request.put("person", personService.getAll());
		System.out.println(request.put("person", personService.getAll()).toString());
		return "list";
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}

	public String delete() {
		personService.delete(id);
		return "delete";
	}
	public String input() {
		return INPUT;
	}
	public String save() {
		System.out.println(model.getPassword()+"密码在这里");
		SecurityAdd securityAdd = new SecurityAdd();
		model.setPassword(SecurityAdd.setSecurityPassword(model.getPassword()));
		personService.save(model);
		return SUCCESS;
	}
	public void prepareSave() {
		model = new TbWaterPerson();
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
	private TbWaterPerson model;
	@Override
	public TbWaterPerson getModel() {
		// TODO 自动生成的方法存根
		return model;
	}
}
