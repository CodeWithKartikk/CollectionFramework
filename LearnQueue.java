package collectionFramework;

import java.util.*;

public class LearnQueue {
    public static void main(String[] args) {
        // FIFO - First in first out
        Queue<Integer> q = new LinkedList<>();

        // Insert Elements to from rear end
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(5);
        System.out.println(q);

        // Remove Elements from fron end
        int a = q.poll();
        System.out.println(a);
        System.out.println(q);

        // Top of the queue
        int b = q.peek();
        System.out.println(b);
    }
}
