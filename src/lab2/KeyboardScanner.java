import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		
		
		Scanner keyboard =new Scanner(System.in);
		
		
		System.out.print("Enter a integer:");
		int x=keyboard.nextInt();
		System.out.print("Enter a float point number:");
		float y=keyboard.nextFloat();
		System.out.print("Enter your name:");
		String name=keyboard.next();
		
		System.out.print("Hi "+name+", the multiplication of "+x+" and "+y+" is");
		System.out.printf("%e",x*y);
		

	}

}
