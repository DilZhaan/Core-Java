public class Node
{
    private Node next;
    private Node prev;
    private int data;
    
    //overloaded Constructor
    Node(int data)
    {
        this.data = data;
    }

    //Setters
    public void setNext(Node next)
    {
        this.next = next;
    }
    public void setPrev(Node prev)
    {
        this.prev = prev;
    }
    public void setData(int data)
    {
        this.data = data;
    }

    //getters
    public Node getNext()
    {
        return next;
    }
    public Node getPrev()
    {
        return prev;
    }
    public int getData()
    {
        return data;
    }
}