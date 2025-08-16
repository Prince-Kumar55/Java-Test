package Strings;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = sc.nextLine();

        System.out.println("Enter your LastName");
        String lastName = sc.nextLine();

        System.out.println("Your full name is : " + firstName + " " + lastName);
    }
}
