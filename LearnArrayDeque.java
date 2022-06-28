package collectionFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // Insert Elements in Doubly Ended Queue
        adq.offer(1);
        adq.offerFirst(2);
        adq.offerLast(3);
        System.out.println(adq);

        // Peek Elements
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        // Delete Elements in doubly ended queue
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
