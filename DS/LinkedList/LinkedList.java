public class LinkedList {
    static class Node {
        int item;
        Node next;

        Node(int value) {
            this.item = value;
            next = null;
        }
    }

    Node head;

    LinkedList() {
        head = null;
    }

    public void insert(int v) {
        System.out.println("Adding item :: " + v);
        if (head == null) {
            head = new Node(v);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(v);
            temp.next = newNode;
        }
    }

    public void printList() {
        System.out.println("Printing List");
        Node t = head;
        while (t != null) {
            System.out.println(t.item);
            t = t.next;
        }
    }

    public void removeItem(int key) {
        Node temp = head;
        Node prev = head;
        if (temp.item == key) {
            temp = temp.next;
            head = temp;
            System.out.println("Item removed :: " + key);
            return;
        } else {
            while (temp != null) {
                if (temp.item == key) {
                    prev.next = temp.next;
                    System.out.println("Item removed :: " + key);
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        System.out.println("No item found  :: " + key);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList");
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.printList();
        l.removeItem(20);
        l.printList();
        l.insert(70);
        l.insert(80);
        l.printList();
        l.removeItem(70);
        l.removeItem(33);
        l.printList();
    }
}