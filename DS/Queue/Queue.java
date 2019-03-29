
class Queue {
    int front, rear, size, capacity;
    int items[];

    Queue(int n) {
        this.items = new int[n];
        this.capacity = n;
        rear = this.capacity - 1;
        front = 0;
    }

    boolean isFull() {
        return this.capacity == this.size;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Q is Full, cannot add :: " + item);
        } else {
            this.rear = (this.rear + 1) % this.capacity;
            this.items[this.rear] = item;
            this.size++;
            System.out.println("Item Added :: " + item);
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Q is Empty");
        } else {
            int item = this.items[this.front];
            this.front = (this.front + 1) % this.capacity;
            this.size--;
            System.out.println("Item removed :: " + item);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Q Implementaion");
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Is Empty :: " + q.isEmpty());
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println("Is Full :: " + q.isFull());
        q.enqueue(70);
        q.dequeue();
        q.dequeue();
    }
}