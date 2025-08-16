package FunctionsOrMethods;

public class LearnMethods {
    public static void main(String[] args) {

       int averageFromFunction = average(4,6 , false);
        System.out.println("Hellow");
        System.out.println(averageFromFunction);
    }

    public static int average(int a, int b , boolean shouldAverage) {
        int avg =(a+b)/2;

        return avg;

        //        System.out.println("The Average is  :  " +avg);

    }

    static void greet(){
        System.out.println("Hellow World");
    }



}
