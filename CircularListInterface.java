/**
 *
 * @author savannah
 */
public interface CircularListInterface {
    public int size();
    public boolean isEmpty();
    public void addFirst(int data);
    public Node deleteFirst() throws IllegalArgumentException;
    public void addLast(int data);
    public void display();
    public int first() throws IllegalArgumentException;
    public int last() throws IllegalArgumentException;
    public void rotate() throws IllegalArgumentException;
    
}
