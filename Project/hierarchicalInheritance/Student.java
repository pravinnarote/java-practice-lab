package hierarchicalInheritance;

public class Student extends Person {
	private String collageName;
	private String deptname;
	private int rollno;
	
	
	public Student(String name, String city, String collageName, String deptname, int rollno) {
		super(name, city);
		this.collageName = collageName;
		this.deptname = deptname;
		this.rollno = rollno;
	}


	public String getCollageName() {
		return collageName;
	}


	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	@Override
	public String toString() {
		return "Student [collageName=" + collageName + ", deptname=" + deptname + ", rollno=" + rollno + ", getName()="
				+ getName() + ", getCity()=" + getCity() + "]";
	}


	
	
}
