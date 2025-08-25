package OOPS_4;

public class LearnAbstract {


    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();
    }
}

abstract class Vehicle {

    abstract void accelerate();

    abstract int brakes(int wheels);



    void honks(){
        System.out.println("Vehicle Honks");
    }
}



class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Car is Accelerating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Car Break is pushed");
        return wheels;
    }

    void honks(){
        System.out.println("Car is Honked");
    }

}
