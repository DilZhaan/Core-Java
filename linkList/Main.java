public class Main
{
    public static void main(String a[])
    {
        linkList list = new linkList();
        
        for(int i = 0; i <= 100; i+=10)
        {
            // int randomNum = (int) (Math.random() * 100);
            list.addNode(i);
        }

        for(int i = 0; i <= 10; i++)
        {
            System.out.println( list.readNext() );
        }
        
        System.out.println("--------- REV ------------");
        
        for(int i = 0; i <= 10; i++)
        {
            System.out.println( list.readPrev() );
        }
    }
}