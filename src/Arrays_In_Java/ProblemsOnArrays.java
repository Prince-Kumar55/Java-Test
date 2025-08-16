package Arrays_In_Java;

public class ProblemsOnArrays {
    public static void main(String[] args) {
        int numbers[] = {41, 255, 34,42 ,55 , 66, 67 ,98, 78};

//        int sum = 0;
//
//        for (int number: numbers){
//            sum += number;
//        }
//        System.out.println("Sum is :" +sum);

//        int min = Integer.MAX_VALUE;
//
//        for (int number: numbers) {
//            if (number < min){
//                min = number;
//            }
//        }
//
//        System.out.println("Smallest number is :  " + min);


//        int marks[][] = new int[4][3];

//        marks[0][0] = 12;
//        marks[0][1] = 98;
//        marks[0][2] = 67;
//
//        marks[1][0] = 42;
//        marks[1][1] = 58;
//        marks[1][2] = 57;
//
//        marks[2][0] = 32;
//        marks[2][1] = 88;
//        marks[2][2] = 47;
//
//        marks[3][0] = 14;
//        marks[3][2] = 99;
//        marks[3][3] = 66;

        int marks[][] = {
                {12, 98, 67},
                {42, 58, 57},
                {32, 88, 47},
                {14, 99, 66}
        };

        System.out.println(marks[2][1]);


    }
}
