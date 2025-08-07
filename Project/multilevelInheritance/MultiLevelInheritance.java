package multilevelInheritance;

import java.util.Scanner;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		City c = new City("India", "Delhi", "Maharashtra", "Marathi", "Nashik", 2003f);
		
		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the Counrty:");
		String country = sc.next();
		System.out.println();
		
		System.out.println("Enetr the capital:");
		String capital = sc.next();
		System.out.println();
		
		System.out.println("Enetr the State:");
		String state = sc.next();
		System.out.println();
		
		System.out.println("Enetr the Language:");
		String language = sc.next();
		System.out.println();
		
		System.out.println("Enetr the city:");
		String city = sc.next();
		System.out.println();
		
		System.out.println("Enetr the Area:");
		float area = sc.nextFloat();
		System.out.println();
		
		City c1 = new City(country, capital, state, language, city, area);
		System.out.println(c1);
		
		sc.close();
	}

}


