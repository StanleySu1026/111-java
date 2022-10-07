import java.util.Scanner;


    
public class Switch
{
    public static void main(String[] args)
    {
        int num1; 
        //int num2;
        //int sum;
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter first integer:");
        num1 = input.nextInt();     
		/*		
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
        */
		switch(num1/10){
			case 10:
				System.out.println("\u975e\u5e38\u597d");
					break;
			case 9:
				System.out.println("\u975e\u5e38\u597d");
					break;
			case 8:
				System.out.println("\u9084\u4e0d\u932f");
					break;
			case 7:
				System.out.println("\u666e\u901a");
					break;
			case 6:
				System.out.println("\u53ca\u683c");
					break;
			default:
				System.out.println("\u4e0d\u53ca\u683c");
				break;
		}
		
    }
    public static void printStr(int str)
    {
        System.out.println(str);
    
    }
}