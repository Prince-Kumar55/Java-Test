package OOPS_4;

public class LearnInnerClass {

    class Toy{
        int price;
    }

    static class Playstation {
        int price;
    }

    public static void main(String[] args) {

        Toy toy = new LearnInnerClass().new Toy();
        toy.price = 45;

        Playstation playstation = new LearnInnerClass.Playstation();
        playstation.price = 2300;

    }

}
