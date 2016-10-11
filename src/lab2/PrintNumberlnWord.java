import java.util.Scanner;

public class PrintNumberlnWord {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);
		System.out.print("Enter a integer:");
		int x=keyboard.nextInt();
		
		if(x==1)
		System.out.println("one");
		else if(x==2)
		System.out.println("two");
		else if(x==3)
		System.out.println("three");
		else if(x==4)
		System.out.println("four");
		else if(x==5)
		System.out.println("five");
		else if(x==6)
		System.out.println("six");
		else if(x==7)
		System.out.println("seven");
		else if(x==8)
		System.out.println("eight");
		else if(x==9)
		System.out.println("nine");
		else 
		System.out.println("other");

	}

}
