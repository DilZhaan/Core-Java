package packages;

public class AdvCalc extends Calc
{
    public int mult(int n1, int n2)
    {
        return n1 * n2; 
    }
    
    public int div(double n1, double n2)
    {
        return (int)(n1 / n2); 
    }
}