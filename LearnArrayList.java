package collectionFramework;

import java.util.*;;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Add Element in between
        list.add(1, 50);
        System.out.println(list);

        // AddAll Function
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(6);
        newList.add(8);
        newList.add(7);
        list.addAll(newList);
        System.out.println(list);

        // Get Operation
        int a = list.get(4);
        System.out.println(a);
        int b = list.get(Integer.valueOf(7));
        System.out.println(b);

        // remove or delete
        list.remove(7);
        int c = list.remove(1);
        System.out.println(c);
        System.out.println(list);

        // Loops
        // Through For Loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Through For Each Loop
        // for (Integer element : list) {
        // System.out.print(list.get(element) + " ");
        // }

        // Through Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Update Element
        list.set(0, 20);
        System.out.println(list);

        // clear function
        list.clear();
        System.out.println(list);
    }
}
