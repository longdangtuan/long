package Overview;
import java.util.Scanner;
public class Overview {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 1 ;
		int b = 2 ;
		int c = 3 ;
	//Using addition operator
		int result = a + b + c ;
		System.out.println("a + b + c = " + result);
	//Using subtraction operator	
		int result2 = a - b - c ;
		System.out.println("a - b - c = " + result2);
	//Using Multiplication operator
		int result3 = a * b * c ;
		System.out.println("a * b * c = " + result3);
	//Using Division operator
		int result4 = a % b % c ;
		System.out.println("a % b % c = " + result4);
		if(c % 2 == 0) {System.out.println("c is an even number");}
		else {System.out.println("c is an odd number");		}}}
	 	
		
