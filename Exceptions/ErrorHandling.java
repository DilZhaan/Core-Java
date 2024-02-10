class Class2{
    public int dvd(int i, int j){
        return i/j;
    }
}

public class ErrorHandling{
    public static void main(String a[]){

        Class2 div = new Class2();
        int i = 25;
        int j = 0;
        int result = 0;
        
        try{
            result = div.dvd(i,j);
            System.out.println("Result : " + result);
        }
        // can handle exeption in catch block
        catch(ArithmeticException e){
            // if j = 0 , we can asign default value and do the proccess again
            j = 2;
            result = div.dvd(i,j);
            System.out.println("Result ( / by default value) : " + result);
        }
        catch(Exception e){
            System.out.println("Something went wrong ! ::: " + e);
        }
        
        
    }
}