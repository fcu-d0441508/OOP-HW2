import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);
		
		System.out.print("Enter a string1:");
		String name1=keyboard.next();
		System.out.print("Enter a string2:");
		String name2=keyboard.next();
		
		
		
		if(name1.equalsIgnoreCase(name2))
			System.out.println("The two srings are the same");
		else
			System.out.println("The two srings are not the same");

	}

}
