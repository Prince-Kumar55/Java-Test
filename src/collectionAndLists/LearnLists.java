package collectionAndLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LearnLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(23);

        System.out.println(list);

        System.out.println(list.get(0));

        list.set(1, 200);
        System.out.println(list);


//        list2.add(21);
//        list2.add(23);
//        list2.add(28);



//        System.out.println(list.size());
//
//        System.out.println(list.contains(20));
//
//        list.remove(1);

//        list.addAll(list2);

//        list.removeAll(list2);

//        list.retainAll(list2);

//        System.out.println(list);
//
//        Object a[] = list.toArray();
//
//        for(Object e : a) {
//            Integer temp = (Integer) e;
//            System.out.println(e);
//        }



    }
}
