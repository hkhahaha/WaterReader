package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import entity.TbSt;
import service.RoomService;
import service.StudentService;

public class StudentAction extends ActionSupport implements RequestAware,ModelDriven<TbSt>,Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public String list(){
		request.put("student", studentService.getAll());
		System.out.println(request.put("student", studentService.getAll()).toString());
		return "list";
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}
	//AJAX
	private InputStream inputStream;

	public InputStream getInputStream() {
		return inputStream;
	}
	//ajax删除，具体看Struts2 API开发手册AJAX
	public String delete() {
		try {
			studentService.delete(id);
			inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
			try {
				inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
			}
		}	
		return "delete";
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
		studentService.save(model);
		return SUCCESS;
	}
	public void prepareSave() {
		model = new TbSt();
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
	private TbSt model;
	@Override
	public TbSt getModel() {
		// TODO 自动生成的方法存根
		return model;
	}
}
