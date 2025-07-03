import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public LearnArrayList(){

        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("List :: "+arrayList); //This will print the list

        arrayList.add(5); //This will add 5 in the list

        arrayList.add(1,7); // This will add 7 at index 1 and right shift all the remaining elements

        System.out.println("List :: "+arrayList);


        List<Integer>newList = new ArrayList<>();
        newList.add(160);
        newList.add(170);


        arrayList.addAll(1,newList); // This will add all elements of newList to the existing list

        System.out.println("List :: "+arrayList);
        //Op :-  List :: [1, 160, 170, 7, 2, 3, 4, 5]

        System.out.println("Element at index 2 :: "+arrayList.get(2));
        //Op : - Element at index 2 :: 170

        arrayList.remove(1);
        System.out.println("Array list after removal :: "+arrayList);
        //OP :- Array list after removal :: [1, 170, 7, 2, 3, 4, 5]

        arrayList.add(7);
        arrayList.add(7);

        System.out.println("Array list before removal :: "+arrayList);
        //OP :- Array list before removal :: [1, 170, 7, 2, 3, 4, 5, 7, 7]

        arrayList.remove(Integer.valueOf(7));

        System.out.println("Array list after removal :: "+arrayList);

        //This will remove the first instance of 7
        // OP :- Array list after removal :: [1, 170, 2, 3, 4, 5, 7, 7]


        //Clearing the list ::
        // arrayList.clear();
        // System.out.println("List after clear :: "+arrayList);
        // OP :- List after clear :: []


        // Updating element at some particular index
        arrayList.set(1,1);
        System.out.println("Updated arraylist :: "+arrayList);


        // Iterating over arrayList

        //using traditional for loop
        for(int i=0;i<arrayList.size();i++){
            System.out.println("Item at i = "+i+" +val = "+arrayList.get(i));
        }

        //Using for each
        for(Integer val: arrayList){
            System.out.println("Val :: "+val);
        }

        //Using Iterator
        Iterator<Integer> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            System.out.println("Element :: "+iterator.next());
        }


    }

}
