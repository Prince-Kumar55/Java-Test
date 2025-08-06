package Loops;

import java.util.Scanner;

public class Learns_loops {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the No.:   ");
//        int n = sc.nextInt();
//        for (int i =1; i<=10; i++){
//            System.out.println(i*n);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.: ");
        int n = sc.nextInt();
//        for (int i =1; i<=10; i++){
//            System.out.println(n + " * " + i + " = " + i*n);
//        }

        // Sum of n natural number
            int sum = 0;
            for(int i = 1; i <= n ; i++) {
//                sum = sum + 2+i;
                  sum += 2*i;
            }
        System.out.println("Sum is:  " + sum);

    }
}
 