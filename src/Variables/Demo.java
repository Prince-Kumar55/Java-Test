package Variables;

public class Demo {
    public static void main(String[] args){
//         int a=10;   //4 bytes
//         long b= a;  //8 bytes
//         float c = a;   //4 bytes
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//
//        float f = 1.7f;
//        int g = (int) f;
//
//        System.out.println(g);


        byte byteValue = 10;  // 1byte
        short shortValue = byteValue;  // 2 byte
        int intValue =shortValue;  // 4 bytes
        long longValue = intValue; //  Widening conversion from int to long
        float floatValue = longValue;  //  Widening conversion from long to float
        double doubleValue = floatValue;  //  Widening conversion from float to double

        System.out.println("byte:   "  + byteValue);
        System.out.println("short:   "  + shortValue);
        System.out.println("int:   "  + intValue);
        System.out.println("long:   "  + longValue);
        System.out.println("float:   "  + floatValue);
        System.out.println("double:   "  + doubleValue);



    }
}
