//Interface dont want a access modifiers
// bcs they are bydefault public abstract
// Varibles it is in interface are always static and final -> bcs interfaces doesnt have memory on heap 

interface InterfaceA
{
    int a = 10; // final var must be initializ 

    void show();
    void config();
}

interface InterfaceB extends InterfaceA
{
    void run();
}

public class Main
{
    public static void main(String a[])
    {
        InterfaceA obj = new A();
        obj.show();
        obj.config();

        System.out.println("InterfaceA var : " + InterfaceA.a);

        // InterfaceA.a = 50; we cant do it because it is final var 

        // we cant create like this because run abstract method didnt implement in class A we need to implement it.
        // we can't use annonymus class to it..
        //but we can override it in anonymous class
        // InterfaceB obj1 = new A();

        InterfaceB obj1 = new A(){
            public void run()
            {
                System.out.println("run run run..");
            }
        };

        obj1.run();
    }
}

// class to class -> extends
// interface to interface -> extends
// interface to class -> implements