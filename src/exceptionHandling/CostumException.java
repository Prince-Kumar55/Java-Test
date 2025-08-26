package exceptionHandling;

import java.util.Scanner;

public class CostumException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age ");
        int age = sc.nextInt();

        if (age > 100) {
            try {
                throw new MyException();
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class MyException extends Exception{

}
