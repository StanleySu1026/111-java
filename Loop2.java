import java.util.Scanner;
 
public class Loop2{
    public static void main(String[] args){
		    String star = "*";
			int x = 0;
			int y = 5;
 		while(x<10 && x>-1){
			System.out.printf("%S\n",star);
			x++;
			star = star + "*";
		
		if(x>=4){
			star = star.substring(0,y);
			y--;
		}
		}	
			
	}
}
