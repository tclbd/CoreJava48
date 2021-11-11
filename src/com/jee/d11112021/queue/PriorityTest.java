package queqeexample;

import java.util.PriorityQueue;

/**
 * Since no Comparator implementation is given to PriorityQueue, 
 * it orders the alphabets in the alphabetical order
 * from lowest ascii valued alphabet to the highest, 
 * even though they’re not added to the queue in that order.
 * So when peeling off elements, the lowest valued alphabets comes out first. 
 * The uppercase alphabets have lower  ascii values than lowercase alphabets 
 * so they appear above lowercase alphabets.
 */
public class PriorityTest {

    public static void main(String[] args) {
        // array of alphabets stored in an unordered way 
        String[] alphabets = {"banana", "e", "d", "h", "j", "apple", "c", "f", "g","pear","i", "B", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        PriorityQueue<String> pq = new PriorityQueue();
        // Fill up with data, in an odd order 
        for (int i = 0; i < alphabets.length; i++) {
            pq.add(alphabets[i]);
        }
        System.out.println(pq);
        // Print out and check ordering 
        for (int i = 0; i < 20; i++) {
            System.out.println(pq.poll());
        }
        //System.out.println(pq.poll());
    }
}
