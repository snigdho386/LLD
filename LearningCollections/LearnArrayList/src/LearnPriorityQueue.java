import java.util.*;

public class LearnPriorityQueue {

    public LearnPriorityQueue(){

        /*  Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println("PQ :: "+pq);

        pq.poll();

        System.out.println("PQ :: "+pq);

        System.out.println("Next element at top :: "+pq.peek());

                //            With Normal pq
                //            O/P :-
                //                    PQ :: [12, 36, 24, 40]
                //                    PQ :: [24, 36, 40]
                //                    Next element at top :: 24

            */


        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println("PQ :: "+pq);

        pq.poll();

        System.out.println("PQ :: "+pq);

        System.out.println("Next element at top :: "+pq.peek());
    }

}
