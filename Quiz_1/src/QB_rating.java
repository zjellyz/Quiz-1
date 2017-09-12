import java.util.Scanner;

public class QB_rating {

	private static double a;
	private static double b;
	private static double c;
	private static double d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new Scanner(System.in);

		System.out.println("Type the munber for passing yards");
		double Yards = input.nextDouble();

		System.out.println("Type the munber for passing attempts");
		double ATT = input.nextDouble();

		System.out.println("Type the munber for passing completions");
		double Comp = input.nextDouble();

		System.out.println("Type the munber for interceptions?");
		double INT = input.nextDouble();

		System.out.println("Type the munber for passing touchdowns");
		double TD = input.nextDouble();

		if ((((Comp / ATT) - 0.3) * 5) > 2.375) {
			a = 2.375;
		} else {
			a = ((Comp / ATT) - 0.3) * 5;

		}
		
		if ((((Yards / ATT) - 3) * 0.25) > 2.375) {
			b = 2.375;
		} else {
			b = ((Yards / ATT) - 3) * 0.25;
		}
		
		if (((TD / ATT) * 20) > 2.375) {
			c = 2.375;
		} else {
			c = (TD / ATT) * 20;
		}
		
		d = 2.375 - ((INT / ATT) * 25);

		double passer_rating = ((a + b + c + d) / 6) * 100;
		System.out.println("QB Rating:");
		System.out.printf("%2.1f", passer_rating);
	}

}
