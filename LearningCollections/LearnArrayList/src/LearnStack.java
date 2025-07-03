import java.util.Stack;

public class LearnStack {

    public LearnStack(){

        Stack<String>st = new Stack<>();

        //Inserted the items in stack
        st.push("Lion");
        st.push("Dog");
        st.push("Horse");
        st.push("Cat");

        System.out.println("Stack :: "+st);

        //fetch the element at top
        System.out.println("Element at Top :: "+st.peek());
        // O/P :- Element at Top :: Cat

        //Pop the top element
        st.pop();
        //Get the peek
        System.out.println("Peek elemnet :: "+st.peek());

    }
}
