package OOPS_2;

public class Car extends Vehicle {
    String colour;

    void start(){
        System.out.println(this);
        System.out.println(this.model+"Car is starting");
    }

    Car(){
        super(4);
        System.out.println("Car is being creating");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.colour = "Red";
        obj.start();
    }
//    void accelerate(){
//
//    }

}
