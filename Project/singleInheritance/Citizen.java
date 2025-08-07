package singleInheritance;

public class Citizen {
	private String name;
	private String address;
	private long phone;
	private long adhaarno;
	
	public Citizen() {
		this.name = "Pravin";
		this.address = "chandwad123";
		this.adhaarno = 123445690L;
		this.phone = 7499255431L;
	}
	
	public Citizen(String name, String address, long phone, long adhaarno) {
		this.name = name;
		this.address = address;
		this.adhaarno = adhaarno;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getAdhaarno() {
		return adhaarno;
	}

	public void setAdhaarno(long adhaarno) {
		this.adhaarno = adhaarno;
	}

	
	public String toString() {
		return "Citizen [Name = "+ name +", Address ="+ address + ", Phone" + phone + ", AdhaaNum = "+ adhaarno +"]"; 
		
	}
	
}















