import java.util.Scanner;
 
public class Loop{
    public static void main(String[] args){
		
        int grade = 0; 
		String space = " ";
		while(grade <= 9){
			System.out.printf("%d\n%S", grade , space);			
			grade++;
			space = space + " ";
			
		}
	}
}