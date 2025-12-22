import java.util.*;

public class arr_creation{
    public static void main(String[] args) {
        // 1#
        int marks[] = new int[100];
        System.out.println("Arrays length : " +marks.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of your sub : ");
        marks[0] = sc.nextInt();// math
        marks[1] = sc.nextInt();// chem
        marks[2] = sc.nextInt();// phy

        System.out.println("math : " +marks[0]);
        System.out.println("chem : " +marks[1]);
        System.out.println("phy : " +marks[2]);

        // marks[2] = 100;  OR
        marks[2] = marks[2] + 2;       
        System.out.println("phy" +marks[2]);

        // CLACULATE PERCENTAGE
        int PERCENTAGE = (marks[0]+ marks[1] + marks[2]) /3;
        System.out.println("Percentage = " +PERCENTAGE +"%");







        // 2#
        // int numbers[] = {1,2,3};

        // 3#
        // String fruit[] = {"Apple" , "Mango" , " Graps"};

        sc.close();

    }

}