import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

    public LearnCollectionClass(){
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        // Gets the min
        System.out.println("Min element :: "+ Collections.min(list));

        // Gets the max
        System.out.println("Max element :: "+ Collections.max(list));

        //Gets the frequency
        System.out.println("Frequency of 9 :: "+ Collections.frequency(list,9));

        //Sorts the collection
        Collections.sort(list, (o1, o2) -> -(o1-o2));
        System.out.println("Sorted List :: "+list);
    }
}
