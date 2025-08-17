package OOPS_1;

public class MainClass {
    public static void main(String[] args) {

//        dog d1 = new dog();
//        d1.name = "Tommy";
//        d1.walk();
//        d1.bark();
//
//
//        dog d2 = new dog();
//        d2.name = "Leo";
//        d2.walk();


        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 5;
        num1.print();


    }
}


class Complex{

    int a, b;

    void print () {
        System.out.println(a + " + " + b+ "i");
    }

}


class dog { // Factory

    String name;

    int age;

    String colour;

    void walk() {
        System.out.println(name +" is walking");
    }

    void bark() {
        System.out.println(name +" is barking");
    }


}

class cat {

}
