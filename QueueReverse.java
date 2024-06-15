package main.problem;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {

// Problema: Revertendo os primeiros K elementos de uma fila

    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k){
        solveQueue(queue, k);
        int n = queue.size() - k;
        while (n-- > 0){
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solveQueue(final Queue<Integer> queue, final int k) {
        if (k == 0) return;
        int element = queue.remove();
        solveQueue(queue, k - 1);
        queue.add(element);

    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(reverseFirstK(queue, 3));
    }

}
