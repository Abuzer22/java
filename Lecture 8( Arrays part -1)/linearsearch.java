// import java.util.*;

public class linearsearch {
    public static int linearsrch(String menu[], String want){
        for(int i=0; i <menu.length; i++){
            if(menu[i].equals(want)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int numbers[] = {5,9,90,78,67,89,99};
        String menu[] = { " dosa", " samosa", "chole bhature", "kurkure"};
        // int key = 67;
        String want = "kurkure";

        // int index = linearsrch(numbers, key);
        int dish = linearsrch(menu, want);
        if (dish == -1){
            System.out.println("Key is not available.");
        }
        else{
            System.out.println("key is on index : " +dish);
        }
    }

}
