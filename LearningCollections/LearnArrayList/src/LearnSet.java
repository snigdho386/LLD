import com.sun.source.tree.Tree;

import java.util.*;

public class LearnSet {

    public LearnSet(){

//        Set<Integer> st = new LinkedHashSet<>();
//        Set<Integer>st = new HashSet<>();
          Set<Integer> st = new TreeSet<>();

        st.add(32);
        st.add(2);
        st.add(54);
        st.add(21);
        st.add(65);

        System.out.println("Set :: "+ st);

        // Removing
        st.remove(54);
        System.out.println("Set :: "+ st);


        // Check if certain element is present
        System.out.println(st.contains(1000));


        // Check if the set is empty
        System.out.println(st.isEmpty());

        //Get the size of set
        System.out.println(st.size());


        //Clear the set
        st.clear();
        System.out.println(st);


        // If I'm using a HashSet it will store in some random order
        // To preserve the order we can use LinkedHashSet
        // To get the set in sorted order cost of operations is O(logn) as it uses BST

    }
}
