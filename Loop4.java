import java.util.Scanner;
 
public class Loop4{
    public static void main(String[] args){
		    String star = "*";			
			String space = "    ";
			int x = 1;
			int y = 3;
		while(x<6){
			System.out.printf("%S%S\n",space,star);
			star = star + "*" + "*";
			space = space.substring(0,y);
			x++;
			y--;
			
			
			
			
		
		}
	}
}
