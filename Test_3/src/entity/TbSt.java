package entity;
// Generated 2019-2-23 22:29:09 by Hibernate Tools 3.5.0.Final

/**
 * TbSt generated by hbm2java
 */
public class TbSt implements java.io.Serializable {

	private Integer id;
	private TbRoom tbRoom;
	private String name;
	private String studentNumber;
	private String grade;
	private String part;

	public TbSt() {
	}

	public TbSt(TbRoom tbRoom, String name, String studentNumber, String grade, String part) {
		this.tbRoom = tbRoom;
		this.name = name;
		this.studentNumber = studentNumber;
		this.grade = grade;
		this.part = part;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TbRoom getTbRoom() {
		return this.tbRoom;
	}

	public void setTbRoom(TbRoom tbRoom) {
		this.tbRoom = tbRoom;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPart() {
		return this.part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	@Override
	public String toString() {
		return "TbSt [id=" + id + ", tbRoom.id=" + tbRoom + ", name=" + name + ", studentNumber=" + studentNumber
				+ ", grade=" + grade + ", part=" + part + "]";
	}

}