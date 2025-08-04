package If_else;

public class ifelse {
    public static void main(String[] args){

//        int age = 4;
//        if(age >= 18) {
//            System.out.println("Your can vote");
//        } else {
//            System.out.println("You can not vote");
//        }

//        int day = 5;
//        if (day == 1){
//            System.out.println("You can go home");
//        } else if (day == 5) {
//            System.out.println("go to village");
//        } else if (day == 4) {
//            System.out.println("go to party");
//        } else {
//            System.out.println("You can go office");
//        }

        // You are given three numbers, find the maximum number

/*
        int a = 4;
        int b = 8;
        int c = 10;

       if ( a > b){
            System.out.println("a is greater then b");
            if(a > c){
                System.out.println(" a is graeter then c");
                System.out.println("a is largest:  " + a);
            } else {
                System.out.println("c is bigger than a");
                System.out.println("c is largest:  " + c);
            }
        } else {
            System.out.println("b is greater then a");
            if(b > c){
                System.out.println(" b is graeter then c");
                System.out.println("b is largest:  " + b);
            } else {
                System.out.println("c is bigger than b ");
                System.out.println("c is largest:  " + c);
            }
        } */



//        int a = 66;
//        int b = 22;
//        int max = 0;
//        max = a>b ? a : b;
//        System.out.println("Value of max:  " + max);

        int a = 6;
        int b = 2;
        int c = 8;
        int max = 0;
        max = a>b ? a>c ? a : c : b>c ? b : c;

        System.out.println("Value of max:  " + max);

//        if ( a > b){
//            max = a;
//        } else {
//            max = b;
//        }




    }
}
