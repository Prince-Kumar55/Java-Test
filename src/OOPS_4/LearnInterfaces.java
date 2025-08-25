package OOPS_4;

public class LearnInterfaces {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
    }

}

interface Pet{

    void sings();
}


interface Animal{


     void eats();
}

class Monkey implements Animal, Pet {

    @Override
    public void eats() {
        System.out.println("Monkey is Eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }
}
