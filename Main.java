import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws BadBadValueException {
		int duration = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give a number");
		duration = sc.nextLine().charAt(0);
		if(duration < 0) {
			throw new BadBadValueException();
		}
		else {
			System.out.println(new TimeDuration(duration).toString());
		}
		
		
		
	}
}
