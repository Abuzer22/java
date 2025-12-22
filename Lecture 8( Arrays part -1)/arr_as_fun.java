// PASSING ARRAYS AS ARGUMENT

// import java.util.*;

// ARRAY COME UNDER CALL BY REFERENCE.

public class arr_as_fun {

    public static void update(int marks[], int unchangeable){
        unchangeable = 780;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] * 10;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,95,99};
        int unchangeable = 786;
        update(marks, unchangeable);
        System.out.println(unchangeable);
        //print our marks
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
