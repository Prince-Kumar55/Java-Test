package Strings;

public class Data_Type {
    public  static void main(String[] args){

        String name = "Prince";
        String sameName = "Prince";
        String newName = new String("PrincE");

//        System.out.println(name);
//        System.out.println(newName);
//        System.out.println(sameName);
//
//        if (name == sameName) {
//            System.out.println("Both are same");
//        }
//
//        if (name == newName) {
//            System.out.println("Both are same");
//        }else {
//            System.out.println("Both are note same");
//        }

        if (name.equals(newName)){
            System.out.println("name and newName have same value");
        }else {
            System.out.println("Not same");
        }

        if (name.equals(newName)){
            System.out.println("name and newName have same value");
        }else {
            System.out.println("Not same");
        }

    }
}
