
package simplecalculator;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        while(true){
            Scanner s = new Scanner(System.in);
            Calculator c = new Calculator();
            System.out.println("\t########################################################################");
            System.out.println("\t\t\t\tScientific Calculator");
            System.out.println("\t------------------------------------------------------------------------");
            System.out.print("\t1. +\t\t2. -\t\t3. *\t\t4. /\t\t5. %\n\n");
            System.out.print("\t6. sin\t\t7. cos\t\t8. tan\t\t9. sec\t\t10. cosec\n\n");
            System.out.print("\t11. cot\t\t12. sqrt\t13. exp\t\t14. square\t15. ln\n");
            System.out.println("\t------------------------------------------------------------------------");
            System.out.print("Select option: ");
            byte option = s.nextByte();
            switch(option){
                case 1:{
                    // additon
                    c.add();                    
                    break;
                }
                case 2:{
                    // subtract
                    c.sub();
                    break;
                }
                case 3:{
                    // multiply
                    c.mul();
                    break;
                }
                case 4:{
                    // div
                    c.div();
                    break;
                }
                case 5:{
                    // mod
                    c.mod();
                    break;
                }
                case 6:{
                    // sin
                    double result = c.sine();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 7:{
                    // cos
                    double result = c.cosine();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 8:{
                    // tan
                    double result = c.tangent();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 9:{
                    // sec
                    double result = 1 / c.cosine();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 10:{
                    // cosec
                    double result = 1 / c.sine();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 11:{
                    // cot
                    double result = 1 / c.tangent();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 12:{
                    // sqrt
                    double result = c.squareRoot();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 13:{
                    // exp
                    double result = c.exponential();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 14:{
                    // square
                    double result = c.squareMethod();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                case 15:{
                    // ln
                    double result = c.lnDetector();
                    System.out.println("Result is = "+result);
                    System.out.println("\n");
                    break;
                }
                default:{
                    // invalid option
                    System.out.println("Invalid option!");
                    System.out.println("\n");
                }
            }
        }
    }
    
}
