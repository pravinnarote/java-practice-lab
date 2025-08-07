
package singleInheritance;

import java.util.Scanner;

public class SingleLevelInheritance {
	public static void main(String[] args) {
		Student s = new Student("om", "niphade1223", 123754623L, 24743913849L, 25, "MET");
		System.out.println(s);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name:");
		String name = sc.next();
		System.out.println();
		
		System.out.println("Enetr the address:");
		String address = sc.next();
		System.out.println();
		
		System.out.println("Enetr the adhaarno:");
		Long adhaarno = sc.nextLong();
		System.out.println();
		
		System.out.println("Enetr the Phone:");
		Long phone = sc.nextLong();
		System.out.println();
		
		System.out.println("Enetr the Rollnum:");
		int rollnum = sc.nextInt();
		System.out.println();
		
		System.out.println("Enetr the CollageName:");
		String collagename = sc.next();
		System.out.println();
		
		Student s1 = new Student(name, address, adhaarno, phone, rollnum, collagename);
		
		System.out.println(s1);
		
		sc.close();
		
	}
}
