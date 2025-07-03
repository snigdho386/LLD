
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public LearnLinkedListQueue(){

       Queue<Integer> queue = new LinkedList<>();

       queue.offer(12);
       queue.offer(24);
       queue.offer(36);

        System.out.println("Queue :: "+queue);
//      OP:-        Queue :: [12, 24, 36]


        //Remove element from first
        queue.poll();

        System.out.println("After poll :: "+queue);
//      OP:-    After poll :: [24, 36]


        System.out.println("Next element to pop :: "+queue.peek());
    }
}
