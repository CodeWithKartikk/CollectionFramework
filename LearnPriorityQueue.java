package collectionFramework;

import java.util.*;;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Insert Elements in Priority Queue
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);

        // Rrmove Elements from Priority Queue
        int b = pq.poll();
        System.out.println(b);
        System.out.println(pq);

        // Top of the priority queue
        int c = pq.peek();
        System.out.println(c);
    }
}
