class Class1{
    public int dvd(int i, int j){
        return i/j;
    }
}

public class Demo{
    public static void main(String a[]){

        Class1 div = new Class1();
        int result = 0;
        
        try{
            result = div.dvd(25,5);
        }
        catch(ArithmeticException e){
            System.out.println("Cant Div by 0 ::: " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong ! ::: " + e);
        }
        
        System.out.println("Result : " + result);
    }
}