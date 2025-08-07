package main;
import java.util.Random;
import java.util.Scanner;

public class ConditionalSta {
    public static void main(String[] args) {
        Random rand = new Random(); 

        int num = rand.nextInt(100);

        if(num >= 0 && num < 50){
            System.out.print("This is number between 0-50:");
            System.out.println(num);
        }
        else{
            System.out.print("This number is greter than 50: ");
            System.out.println(num);
        }

    // ****************************************************************

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Number: ");
            int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Sonday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        sc.close();


    //*************************************************************

        String day = "Monday";
        System.out.print("My morning weakup time: ");
        switch (day) {
            case "Sunday", "Saturday" -> System.out.println("6am");
            case "Monday" -> System.out.println("7am");
            default -> System.out.println("5am");
        }

    // *****************************************************************
        String result = " ";
        result = switch(day)
        {
            case "Sunday", "Saturday" : yield "6am";
            case "Monday" : yield "7am";
            default : yield "5am";
        };
        System.out.println(result);
    }
}
