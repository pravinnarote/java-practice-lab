package singleInheritance;

public class Student extends Citizen {
	private int rollnum;
	private String collagename;
	
	public Student(String string, String string2, long l, long m, String string3, int i) {
		
	}
	
	public Student(String name, String address, long adhaarno, long phone, int rollnum, String collagename) {
		super(name, address, adhaarno, phone);
		
		this.collagename = collagename;
		this.rollnum = rollnum;
	}
	
	public String getCollage(String collagename) {
		return collagename;
	}
	
	public void setCollage(String collagename) {
		this.collagename = collagename;
	}
	
	public String getRollnum(String rollnum) {
		return rollnum;
	}
	
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	
	@Override
	public String toString() {
		return "Student [ getName = "+ getName() +", getAddress() ="+ getAddress() + ", getAdhaar ="+ getAdhaarno() + ", getPhone ="+ getPhone() + ", CollageName = "+ collagename +", Rollnum ="+ rollnum +"]";
		
	}
}











