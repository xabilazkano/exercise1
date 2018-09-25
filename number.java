import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		int number;
		Scanner num = new Scanner(System.in);
		System.out.println("Yo have to enter ten numbers and the system will tell you if they are odd or even.");
		
		for (int i=0;i<10;i++) {
			System.out.println("Enter a number");
			number = num.nextInt();
			if (number%2== 0){
				System.out.println("The number " + number + " is even");
			}
			else {
				System.out.println("The number " + number + " is odd");
			}
		}
		System.out.println("The programm has finished");
	}
}
