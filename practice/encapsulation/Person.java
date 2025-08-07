package encapsulation;

public class Person {
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Person(){
		this.id = 123;
		this.name = "mangesh";
	}

	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [Name = "+ name +", id = "+ id +"]";
	}
	
}
	