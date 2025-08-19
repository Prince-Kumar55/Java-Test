package OOPS_1;

public class LearnConstructors {
    public static void main(String[] args) {

        Complex num1 = new Complex();
        Complex num2 = new Complex();
            num1.print();
        num2.print();

    }
}

class Complex{

    int a, b;

    public Complex(){
        a = 4;
        b = 9;
    }

    void print () {
        System.out.println(a + " + " + b+ "i");
    }

}