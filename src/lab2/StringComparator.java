import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		Scanner keyboard =new Scanner(System.in);
		
		int flag=0;
		
		do
		{
		System.out.print("Enter a string1:");
		String name1=keyboard.next();
		System.out.print("Enter a string2:");
		String name2=keyboard.next();
		
		
		
		if(name1.equalsIgnoreCase(name2))
			{
				System.out.println("The two srings are the same");
				break;
			}
		else
			System.out.println("The two srings are not the same");
		}while(flag==0);
	}

}
