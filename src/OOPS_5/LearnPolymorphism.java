package OOPS_5;

class Data {
    int data;

}

public class LearnPolymorphism {



    public static void main(String[] args) {

        int a = 5;
        Data obj = new Data();
        obj.data = 5;


        ChangeValue(a);
        System.out.println(a);

    }

    static void ChangeValue(int a) {
        a = 10;
    }
}
