import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Queue<Integer>pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        Iterator<Integer>itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}