/**
 * 
 */

/**
 * @author jasbirsingh
 *
 */
import java.util.Scanner;

public class Code1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Choice;
		String[] availableChoices = {
				"1-Find the Palindrome Number",
				"2-Print Pattern for given Number",
				"3-Check Whether the number is prime or not",
				"4-PrintFibonacci Series","0-To End the Program"};
		
		do {
		for(String ele : availableChoices)
			System.out.println(ele);
		System.out.println("Enter Your Choice");
		Choice = sc.nextInt();
				

		switch (Choice) {

		case 1: {System.out.println("Runing Code" + Choice);break;}

// For Choice 2-Print Pattern for given Number		
		case 2: {
			System.out.println("For " + availableChoices[1] + "\nPlease Enter an Number");
			int rows,columns ;
			rows =columns =sc.nextInt();
			
			for(int i = 0; i < rows; i++,columns--) {
				for(int j =0 ; j< columns; j++)
					System.out.print("*");
				System.out.println();
			}			
			break;}

// For Choice 3-Check Whether the number is prime or not		
		case 3: {
			System.out.println("For " + availableChoices[2] + "\nPlease enter a number to check whether its Prime number or Not");
			int num =sc.nextInt();
			boolean flag = true;
			for(int i = 2 ; i<= num/2 ; i++) {
				if (num % i==0) {
					flag = false;
					break;
				}
			}
			
			System.out.println(flag ==true ? num + " is a Prime Number" :  num + " is not a Prime Number");
			break;}
		
		
		case 4: {System.out.println("Runing Code" + Choice);break;}
		
		default : System.out.println(Choice == 0 ? "Program Exited !!" : "Please Enter a valid Choice !!"); 

		
		}
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		}while( Choice != 0 );
		
		
		sc.close();
	}	
}
