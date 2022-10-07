
import java.util.Scanner;


    
public class Sum
{
    public static void main(String[] args)
    {
        int num1; 
        //int num2;
        //int sum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first integer:");
        num1 = input.nextInt();
        
        //System.out.println("Enter second integer:");
        //num2 = input.nextInt();
        
        //sum = num1 + num2;
        //System.out.println("The sum is " + sum);
        
        if (num1 >= 90){
            System.out.println("\u975e\u5e38\u597d");
        }
        else if (num1 < 90 && num1 >= 80){
            System.out.println("\u9084\u4e0d\u932f");
        }
        else if (num1 < 80 && num1 >= 70){
            System.out.println("\u666e\u901a");
        }
        else if (num1 < 70 && num1 >= 60){
            System.out.println("\u53ca\u683c");
        }  
        else {
            System.out.println("\u4e0d\u53ca\u683c");
        }
        
    }
    public static void printStr(int str)
    {
        System.out.println(str);
    
    }
}