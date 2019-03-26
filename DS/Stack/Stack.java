/*
 * Stack Data Structure (Introduction and Program) Stack is a linear data
 * structure which follows a particular order in which the operations are
 * performed. The order may be LIFO(Last In First Out) or FILO(First In Last
 * Out). Mainly the following three basic operations are performed in the stack:
 * 
 * Push: Adds an item in the stack. If the stack is full, then it is said to be
 * an Overflow condition.
 * 
 * Pop: Removes an item from the stack. The items are popped in the reversed
 * order in which they are pushed. If the stack is empty,then it is said to be
 * an Underflow condition.
 * 
 * Peek or Top: Returns top element of stack. 
 * isEmpty: Returns true if stack is empty, else false.
 */

//Will implement Stack Using Array
class Stack {
    int items[];
    int size = 0;

    Stack(int size) {
        items = new int[size];
    }

    Stack() {
        items = new int[20];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void push(int newItem) {
        if (size != items.length) {
            System.out.println("Adding Item :: " + newItem);
            items[size++] = newItem;
        } else {
            System.out.println("Stack is Full, overflow condition");
        }
    }

    private void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to pop");
        } else {
            System.out.println("Popping Item :: " + items[--size]);
        }
    }

    private void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to peek");
        } else {
            System.out.println("Top Item :: " + items[size - 1]);
        }
    }

    public static void main(String args[]) {
        Stack stk = new Stack(5);
        System.out.println("Is Stack Empty " + stk.isEmpty());
        System.out.println("Adding item");
        stk.push(10);
        stk.push(15);
        stk.push(20);
        System.out.println("Is Stack Empty " + stk.isEmpty());
        System.out.println("Remove Item");
        stk.pop();
        stk.pop();
        stk.push(12);
        stk.peek();
        stk.pop();
        stk.peek();

    }

}