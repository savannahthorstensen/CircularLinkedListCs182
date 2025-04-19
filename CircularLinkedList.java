/**
 *
 * @author savannah
 */
public class CircularLinkedList3 {

    Node tail;
    int numOfItems;

    public CircularLinkedList3() {
        tail = null;
    }

    public int size() {
        return numOfItems;
    }

    public boolean isEmpty() {
        return numOfItems == 0;
    }

    public void display() {
        Node curr = tail.next;
        for (int i = 0; i < numOfItems; i++) {
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            tail = n;
            tail.next = n;
        } else {
            n.next = tail.next;
            tail.next = n;
        }
        numOfItems++;
    }

    public Node deleteFirst() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }
        Node temp = tail.next;
        if (numOfItems == 1) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
        numOfItems--;
        return temp;
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            tail = n;
            n.next = tail;
        } else {
            n.next = tail.next;
            tail.next = n;
            tail = n;
        }
        numOfItems++;
    }

    public int first() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty list");
        } else {
            return tail.next.value;
        }
    }

    public int last() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty list");
        } else {
            return tail.value;
        }
    }

    public void rotate() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty list");
        } else {
            tail = tail.next;
        }
        

    public Node delete(int item) throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }
        Node curr = tail.next;
        Node prev = tail;

        for (int i = 0; i < numOfItems; i++) {
            if (curr.value == item) {
                if (curr == tail.next) {
                    if (numOfItems == 1) {
                        tail = null;
                    } else {
                        tail.next = tail.next.next;
                    }
                } else if (curr == tail) {
                    prev.next = tail.next;
                    tail = prev;
                } else {
                    prev.next = curr.next;
                }
                numOfItems--;
            }
            prev = curr;
            curr = curr.next;
        }
        return null;
    }
}

    
