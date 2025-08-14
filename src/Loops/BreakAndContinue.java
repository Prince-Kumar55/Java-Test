package Loops;

public class BreakAndContinue {
    public static void main(String[] args) {
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i);
//            if(i == 3) break;
//        }

//        for (int i = 1; i <= 10; i++) {
//            if(i == 3 || i == 8) continue;
//            System.out.println("Gave toffee to  "+i);
//
//        }

//        for (int i = 0; i < 6; i++) {
//            for (int j = 1; j < 6; j++) {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//
//        }

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j =0;
            while (j<=5){
                if (j == 3) break outerLoop;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }





    }
    
}
