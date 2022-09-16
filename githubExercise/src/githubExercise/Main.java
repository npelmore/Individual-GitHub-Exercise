package githubExercise;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("For comparing integers, please enter 1. For comparing strings, please enter 2.");
		int answer = input.nextInt();
	
		if(answer == 1) {
			System.out.println("Please enter an integer:");
			int num1 = input.nextInt();
			System.out.println("Please enter another integer:");
			int num2 = input.nextInt();
			
			int result = intCompare(num1,num2);
			
			if (result==1) System.out.println(num1+ " is greater than " + num2);
			else if (result==2) System.out.println(num2 + " is greater than " + num1);
			else System.out.println("The integers are equal");
		}
		else if(answer==2) {
			
			System.out.println("Please enter an string with no spaces:");
			String str1 = input.next();
			System.out.println("Please enter another string with no spaces:");
			String str2 = input.next();
			
			int result = strCompare(str1,str2);
			
			if (result==1) System.out.println(str1+ " is greater than " + str2);
			else if (result==2) System.out.println(str2 + " is greater than " + str1);
			else System.out.println("The strings are equal");
		}
		else System.out.println("You have entered neither 1 nor 2. Please restart to try again.");
	}
	public static int intCompare(int a, int b) {
		if (a>b) return 1;
		else if (a<b) return 2;
		else return 3;
	}
	public static int strCompare(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		if (aLength>bLength) return 1;
		else if (aLength<bLength) return 2;
		else return 3;
	}
}
