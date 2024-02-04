public class linkList
{
    private Node start;
    private Node end;
    private Node readPointer;

    public void addNode(int data)
    {
        Node obj = new Node(data);

        if(start == null && end ==  null)
        {
            start = end = obj;
        }
        else
        {
            obj.setPrev(end);
            end.setNext(obj);

            end = obj;
        }
    }

    public int readNext()
    {
        int data;
        if(readPointer == null)
            readPointer = start;
        else
            readPointer = readPointer.getNext();
        data = readPointer.getData();
        return data;
    }

    public int readPrev()
    {
        int data;

        if(readPointer ==  null)
            readPointer = end;
        else if(readPointer.getPrev() != null)
            readPointer = readPointer.getPrev();
        else{
            System.out.println("Previous Node Does not Exists!!");
            return 404;
        }
        data = readPointer.getData();
        return data;
    }
}