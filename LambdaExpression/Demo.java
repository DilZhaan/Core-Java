@FunctionalInterface
interface DemoInterface
{
    void show();
}

@FunctionalInterface
interface GetSinglePara
{
    void show(int j);
}

@FunctionalInterface
interface GetMultiPara
{
    void show(int j, int k);
}

@FunctionalInterface
interface Calculator
{
    int add(int j, int k);
}

public class Demo
{
    public static void main(String a[])
    {

        //Normal way to  Create obj using interface (No parameters no returns)
        /*
        DemoInterface interfaceObj = new DemoInterface() {
            public void show()
            {
                System.out.println("in Show...");
            }
        };
        */

        //Creating Interface object using Lambda Expression
        DemoInterface interfaceObj = () -> System.out.println("in Show...");

        //if Anon class have multiple statements, we can code like this
        /*
        DemoInterface interfaceObj = () -> 
            {
                System.out.println("in Show...");
                ----;
                ----;
            };

        */
        
        interfaceObj.show();

        //Normal way to  Create obj using interface (Single parameter no returns)
        /*
        GetSinglePara singleObj = new GetSinglePara() 
        {
            public void show(int j)
            {
                System.out.println(j + " in Single Show..");
            }
        };
        */

        // didn't want paranthesis & var type with single para
        GetSinglePara singleObj = j -> System.out.println(j + " in Single Show.."); 

        singleObj.show(6);

        
        //Normal way to  Create obj using interface (More parameters no returns)
        /*
        GetMultiPara multiObj = new GetMultiPara()
        {
            public void show(int j, int k)
            {
                System.out.println("Sum is : " + (j+k) );
            }
        };
        */

        // didn't want var type with paras
        GetMultiPara multiObj = (j,k) -> System.out.println("Sum is (multi) : " + (j+k));
        multiObj.show(7,8);

        
        //Normal way to  Create obj using interface (parameters with only returns statement)
        /*
        Calculator calObj = new Calculator() 
        {
            public int add(int j, int k)
            {
                return k+j;
            }
        };
        */

        //if anon class only have return statement. it doesn't want to write "return" word. simply type the return value only
        Calculator calObj = (j,k) -> j+k;
        System.out.println("Calc Value is : " + calObj.add(10, 15) );
    }

}