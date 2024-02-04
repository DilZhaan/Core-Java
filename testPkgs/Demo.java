// this program using Inheritance concept and packages

import packages.*; // all files importing

//can import packages one by one
// import packages.Calc;
// import packages.Calc;

//main class
public class Demo
{
    //main method
    public static void main(String a[])
    {
        //Create basicCalculator obj using Calc class -> packages.Calc
        Calc basicCalculator = new Calc();
        System.out.println("Add method Result (BasicCal) :" + basicCalculator.add(1,2));
        System.out.println("Sub method Result (BasicCal) :" + basicCalculator.sub(8,2));


        System.out.println();
        
        //Create advanceCalculator obj using AdvCalc class -> packages.AdvCalc
        AdvCalc advanceCalculator = new AdvCalc();
        System.out.println("Add method Result (AdvCal) :" + advanceCalculator.add(1,2));
        System.out.println("Sub method Result (AdvCal) :" + advanceCalculator.sub(8,2));
        System.out.println("Mult method Result (AdvCal) :" + advanceCalculator.mult(2,5));
        System.out.println("Div method Result (AdvCal) :" + advanceCalculator.div(6,3));
    } 
}