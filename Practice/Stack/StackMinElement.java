
//find min element in stack in O(1) and space O(1)
// 20,34,12,22
import java.util.LinkedList;
import java.util.Stack;

class StackMinElement {
    int minEle;
    Stack<Integer> s;
    Stack<Integer> min;

    StackMinElement() {
        s = new java.util.LinkedList<Integer>();
        min = new LinkedList<Integer>();
        minEle = Integer.MIN_VALUE;
    }

    /* returns min element from stack */
    int getMin() {
        // Your code here
        if (s.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return minEle;
    }

    /* returns poped element from stack */
    int pop() {
        // Your code here
        int x = s.pop();
        return x;

    }

    /* push element x into the stack */
    void push(int x) {
        // Your code here
        if (x < minEle) {
            minEle = x;
        }
        s.add(x);
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}