import java.util.Scanner;
 
public class Loop3{
    public static void main(String[] args){
		    int x = 1;			

			
		while(x<=5){
			
			int y = 1;
			int z = 1;
			while(y<=5-x){
				System.out.print(" ");
				y++;
			}
			while(z<=x*2-1){
				System.out.print("*");
				z++;
			}
			System.out.println("");
			x++;
		}
	}
}
