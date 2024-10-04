import java.util.Scanner;
import java.lang.Math;

class Calculator {
    
    public static double pumpCalc (double h) {
        return (h / 2.31) + 5;
    }
    
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Enter piping height");
        
        double pHeight = Scanner.nextDouble();
        
        double airPress = pumpCalc(pHeight);
        
        System.out.println("Needed expansion tank air pressure is " + airPress);
    }
}
