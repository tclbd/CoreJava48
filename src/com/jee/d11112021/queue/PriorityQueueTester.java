package queqeexample;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTester {

    public static void main(String[] args) {
        String[] alphabets = {"b", "e", "d", "h", "j", "a", "c", "f", "g", "i",
            "B", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        PriorityQueue<String> pq = new PriorityQueue(20, new Comparator<String>() {
            // overriding the compare method 

            public int compare(String i, String j) {
                return i.compareToIgnoreCase(j);
            }
        });
// Fill up with data, in an odd order 
        for (int i = 0; i < 20; i++) {
            pq.offer(alphabets[i]);
        }
// Print out and check ordering 
        for (int i = 0; i < 20; i++) {
            System.out.println(pq.poll());
        }
    }
}
