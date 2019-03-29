import java.io.*;
import java.util.*;

class Frequency {

    static void insert(Queue<Integer> q, int k) {
        q.add(k);
    }

    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k) {
        int count = 0;
        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()) {
            int item = itr.next();
            if (item == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<Integer>();
        insert(q, 2);
        insert(q, 4);
        insert(q, 2);
        insert(q, 1);
        System.out.println(findFrequency(q, 2));
    }
}