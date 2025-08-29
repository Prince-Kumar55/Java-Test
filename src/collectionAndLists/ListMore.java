package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");


        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit is  " + fruits.get(i));

        }

        



    }
}
