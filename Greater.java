import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number ");
		int First = sc.nextInt();
		System.out.println("Enter The Second Number");
		int Second = sc.nextInt();

		int greater = 0;

		if (First > Second) {
			greater = First;
		} else {
			greater = Second;
		}
		System.out.println("The Greater Number is "+ greater);
	}

}
