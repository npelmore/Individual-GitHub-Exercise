package githubExercise;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter an integer:");
		
		int num1 = input.nextInt();
		
		System.out.println("Please enter another integer:");
		
		int num2 = input.nextInt();
		
		int result = intCompare(num1,num2);
		
		if (result==1) System.out.println(num1+ " is greater than " + num2);
		else if (result==2) System.out.println(num2 + " is greater than " + num1);
		else System.out.println("The integers are equal");
	
	}
	
	public static int intCompare(int a, int b) {
		if (a>b) return 1;
		else if (a<b) return 2;
		else return 3;
	}

}
