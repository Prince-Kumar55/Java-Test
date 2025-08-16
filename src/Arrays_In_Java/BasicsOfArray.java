package Arrays_In_Java;

public class BasicsOfArray {
    public static void main(String[] args) {
        int age[] = new int[5];

        age[0] = 5;
        age[3] = 7;

        System.out.println(age[0]);
        System.out.println(age[2]);
        System.out.println(age[3]);


        int marks[] = {9, 4, 4, 67};
        System.out.println(marks[3]);

        String names[] = {"Prince" , "ola" , "vida" , "chetak" ,"Qube"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is : " + names[i]);

        }

        for(String name: names) {
            System.out.println("For each :  " +name);
        }
    }
}
