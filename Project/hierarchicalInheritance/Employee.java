package hierarchicalInheritance;

public class Employee extends Person {
	private String companyName;
	private String dept;
	private int deptId;
	
	
	
	public Employee(String name, String city, String companyName, String dept, int deptId) {
		super(name, city);
		this.companyName = companyName;
		this.dept = dept;
		this.deptId = deptId;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getDeptId() {
		return deptId;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ",companyName=" + companyName + ", dept=" + dept + ", deptId=" + deptId + ", getCity()=" + getCity() + "]";
	}
	
}
