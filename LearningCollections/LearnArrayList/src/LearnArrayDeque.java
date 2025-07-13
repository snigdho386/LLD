import java.util.ArrayDeque;

public class LearnArrayDeque {

    public LearnArrayDeque(){

        ArrayDeque<Integer> adq = new ArrayDeque();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);
        System.out.println("Adq :: "+adq);

        System.out.println(adq.peek());
        System.out.println("Peek first "+adq.peekFirst());
        System.out.println("Peek last "+adq.peekLast());

        adq.poll();
        System.out.println("Adq poll :: "+adq);


        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() :: "+adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() :: "+adq);




    }

}
