import java.util.*;

public class string {
    public static void printLetters(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // STRINGS ARE IMMUTABLE{IT CAN NOT CHANGE}
    
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("pyq");
        // System.out.println(arr + "hello" + "hello"+ str + "hello" + str2);

        // green =======================
        // green STRINGS INPUT AND OUTPUT
        // green =======================

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        sc.close();

        // green =======================
        // green STRINTG LENGTH 
        // green =======================

        // String fullName = " Abuzer";
        // System.out.println(fullName.length());

        //green =======================
        // green STRING CONCATENATION 
        // green =======================

        // String firstName = "Abuzer";
        // String LastName = "Akbar";
        // String FinalName = firstName + " "  + LastName;
        // System.out.println(FinalName + " is this");

        // green =======================
        // green CharAT METHOD
        // green =======================

         String firstName = "Abuzer";
        String LastName = "Akbar";
        String FinalName = firstName + " "  + LastName;
        System.out.println(FinalName.charAt(5));

        // printLetters(FinalName);




    }
}

