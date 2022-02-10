package code9;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String arg[]){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i=10;i>0;i--){
            queue.add(i);
            /// (front ) 10 9 8 7 6 5 4 3 2 1 ( rear)
            // prioroty queueu sort itis asending order
            //peaking is obtiang the head
            // polling is removing the
        }
        System.out.println( " so the sort one is " + queue);
        System.out.println(" head of the queue is  " + queue.peek());
        queue.poll();
        System.out.println(" head of the queue is  " + queue.peek() + " and the size of the remang quuwu is "+ queue.size());


    }
}
