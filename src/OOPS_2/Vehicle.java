package OOPS_2;

public class Vehicle {

    final int gears = 4;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
//        v1.gears = 6;
    }

    int wheelsCount;
    String model;

    Vehicle(){
        System.out.println("Creating a vehicle Instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle is Starting");
    }

    final void accelerate() {
        System.out.println("Vehicle is accelerating");
    }




}
