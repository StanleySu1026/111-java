import java.util.Scanner;


    
public class Switch2
{
    public static void main(String[] args)
    {
        int num1; 

        Scanner input = new Scanner(System.in);        
        System.out.println("Enter first integer:");
        num1 = input.nextInt();     
		if (num1 > 100 || num1 < 0)
			//num1=200;
			System.out.println("\u8f38\u5165\u932f\u8aa4");
		else{
		switch(num1/10){
			case 10:
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
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("\u4e0d\u53ca\u683c");
				break;
			default:
				//System.out.println("\u8f38\u5165\u932f\u8aa4");
				//break;
			}
		}
    }
    public static void printStr(int str)
    {
        System.out.println(str);
    
    }
}