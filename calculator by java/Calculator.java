
package simplecalculator;
import java.util.Scanner;

public class Calculator {
    public void add(){
        double n1, n2, sum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        sum = n1 + n2;
        System.out.println("Sum is = "+sum);
        System.out.println("\n");
    }
    
    public void sub(){
        double n1, n2, sub;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        sub = n1 - n2;
        System.out.println("Subtraction is = "+sub);
        System.out.println("\n");
    }
    
    public void mul(){
        double n1, n2, mul;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        mul = n1 * n2;
        System.out.println("Multiplication is = "+mul);
        System.out.println("\n");
    }
    
    public void div(){
        double n1, n2, div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        div = n1 / n2;
        System.out.println("Division is = "+div);
        System.out.println("\n");
    }
    
    public void mod(){
        int n1, n2, mod;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = s.nextInt();
        n2 = s.nextInt();
        mod = n1 % n2;
        System.out.println("Reminder is = "+mod);
        System.out.println("\n");
    }
    
    public double sine(){
        double a, theta;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the angle: ");
        a = s.nextDouble();
        theta = Math.toRadians(a);
        return Math.sin(theta);
        
    }
    
    public double cosine(){
        double a, theta;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the angle: ");
        a = s.nextDouble();
        theta = Math.toRadians(a);
        return Math.cos(theta);
        
    }
    
    public double tangent(){
        double a, theta;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the angle: ");
        a = s.nextDouble();
        theta = Math.toRadians(a);
        return Math.tan(theta);
    }
    
    public double squareRoot(){
        double a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = s.nextDouble();
        return Math.sqrt(a);
    }
    
    public double exponential(){
        double a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = s.nextDouble();
        return Math.exp(a);
    }
    
    public double squareMethod(){
        double a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = s.nextDouble();
        return a * a;
    }
    
    public double lnDetector(){
        double a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = s.nextDouble();
        return Math.log10(a);
    }   
}
