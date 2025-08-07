package hierarchicalInheritance;

import java.util.Scanner;

public class Hierarchical {

	public static void main(String[] args) {
		Employee e = new Employee("Pravin", "Nashik", "Infosys", "IT", 28);
		Student s = new Student("Om", "Niphad", "MET", "comp", 58);
		
		System.out.println(e);
		System.out.println(s);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.next();
		
		System.out.println("Enetr the City: ");
		String city = sc.next();
		
		System.out.println("Enetr the CompanyName Name: ");
		String companyName = sc.next();
		
		System.out.println("Enetr the Dept Name: ");
		String dept = sc.next();
		
		System.out.println("Enetr the Id: ");
		int id = sc.nextInt();
		
		Employee e1 = new Employee(name, city, companyName, dept, id);
		
		System.out.println(e1);
		
		sc.close();
	}

}
