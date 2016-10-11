import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);
		
		System.out.print("Enter a integer:");
		int x=keyboard.nextInt();
		
		if(x%2==1)
		{
			System.out.println("The input integer is Odd Number.");
		}
		else if(x%2==0)
			System.out.println("The input integer is Even Number.");

	}

}
