package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false ;

        while(!hasLearnt){
            System.out.println("Went to school , Tried to learn");
            System.out.println("Have you undershood?");
            hasLearnt = sc.nextBoolean();
        }
        System.out.println("Okay Prince");

        int i = 8;

        do {
            System.out.println(i);
            i++;
        } while(i <= 6);
        System.out.println("out of the loop ");

    }
}
