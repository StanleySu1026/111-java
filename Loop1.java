import java.util.Scanner;
 
public class Loop1{
    public static void main(String[] args){
		    int x = 0;			
			int t;
		while(x<9){
			t = x;
			if (x >= 5){
				t = 8 - x;
			}
			int y = 0;
			while(y<=t){
				System.out.print("*");
				y++;			
			}
			System.out.println("");
			x++;
		}
	}
}
