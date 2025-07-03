import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayClass {

    public LearnArrayClass(){

        // BS on array
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("BS on 3 :: "+ Arrays.binarySearch(numbers,3));

        int[] numbers1 = {1,2,8,5,99,36};
        Arrays.sort(numbers1);

        for(Integer i: numbers1){
            System.out.print(i+" ");
        }

        Arrays.fill(numbers1,12);

        for(Integer i: numbers1){
            System.out.print(i+" ");
        }





    }
}
