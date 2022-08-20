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
				"4-Print Fibonacci Series","0-To End the Program"};
		
		do {
		for(String ele : availableChoices)
			System.out.println(ele);
		System.out.println("Enter Your Choice");
		Choice = sc.nextInt();
			

		switch (Choice) {
//For Choice 1 Find the Palindrome Number
		case 1: {
		 System.out.println("For " + availableChoices[0] + "\nPlease Enter an Number");
		 int num = sc.nextInt();
		 String num2 = String.valueOf(num) ;
		 boolean flag = true;
		 int i,j ;
		 i = 0;
		 j = num2.length()-1;
		 while (j>0) {
			 
			 if (num2.charAt(i) != num2.charAt(j))
					 flag = false;
		 i++;
		 j--;
			 
		 }
		 
		 
		 if (flag) {
			 System.out.println(num + " is a Palindrome");
			 
		 } else {
			 
			 System.out.println(num + " is not a Palindrome");
		 }
		 		 
		 
		break;}

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
			
			System.out.println(flag ==true ? num + " is a Prime Number" :  num + " is not a Prime Number1");
			break;}
		
// for Print Fibonacci series of size n with first two numbers as 0, 1
		
		case 4: {
			System.out.println("For " + availableChoices[3] + "\nPlease enter the Fibonacci series size");
			int num = sc.nextInt();
			int[] fibonacci = new int[num];
			
			fibonacci[0] = 0;
			fibonacci[1] = 1;
		
			for(int i = 2; i < num; i++ ) {
				fibonacci[i] =  fibonacci[i-1] +fibonacci[i-2]; 
				
			}
			
			System.out.print("The Fabonacci Serires is : " );
			int i =0;
			for (int x : fibonacci) {
				System.out.print(x);
				System.out.print(i<num-1? ", ":"\n" );
				++i;
			}
				
		break;}
		
		default : System.out.println(Choice == 0 ? "Program Exited !!" : "Please Enter a valid Choice !!"); 

		
		}
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		}while( Choice != 0 );
		
		
		sc.close();
	}	
}
