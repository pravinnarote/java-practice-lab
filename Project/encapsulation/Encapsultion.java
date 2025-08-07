package encapsulation;
import java.util.Scanner;  

public class Encapsultion {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(20);
        p1.setName("Mahesh");
        System.out.println(p1);

        Person p2 = new Person();
        p2.setId(120);
        p2.setName("Ganesh");

        Person p3 = new Person(105, "Sakshi");
        System.out.println(p3);

        Scanner sc = new Scanner(System.in);  // FIXED

        System.out.print("Enter the Id: ");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        Person p4 = new Person(id, name);
        System.out.println(p4);

        System.out.println(p2);

        sc.close();  // Close scanner to prevent resource leak
    }
}
