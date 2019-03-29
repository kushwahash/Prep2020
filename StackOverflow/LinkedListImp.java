class Node {
    int data;
    Node next;

    Node(int i) {
        this.data = i;
        this.next = null;
    }
}

public class LinkedListImp {
    // removing Node nested class
    Node head;

    public void buildList1() {
        head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

    }

    public boolean removeNode(LinkedList list, int x) {
        // 1 3 5 7---to delete 5
        Node q = list.head;// q
        // Node p=head.next;//p
        Node prev = null;

        if (q != null && q.data == x) {
            head = q.next;
            // q=null;
            System.out.println("next to head" + head.data);
            return true;
        }
        while (q != null && q.data != x) {
            prev = q;
            q = q.next;
        }
        if (q == null)
            return false;
        prev.next = q.next;

        return true;

    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.buildList1();

        list.printList();
        System.out.println(list.removeNode(list, 1));
        list.printList();

    }

}