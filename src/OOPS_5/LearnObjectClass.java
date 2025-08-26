package OOPS_5;

class Car{
    String model;

    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

}

public class LearnObjectClass {

    public static void main(String[] args) {
        Car obj = new  Car("Honda",2022);
        System.out.println(obj);
    }
}
