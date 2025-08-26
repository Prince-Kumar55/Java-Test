package genericsAndWrapperClasses;

public class LearnGenerics {

    public static void main(String[] args) {

        dog<String> Dog = new dog<>("123");
        dog<String> Dog1 = new dog<>("12345bvcx");

        dog<Integer> Dog2 = new dog<>(123);

    }
}

class dog<E> {
    E id;
//    V name;
    public dog(E id){
        this.id = id;
//        this.name = name;
    }
}
