import java.util.Scanner;
public class TotalTuitionBill{
	static Scanner input = new Scanner(System.in);
	private static double initial;
	private static double increase;
	private static double APR;
	private static int term;
	public static void main(String[] args) {
		tuition.information();
		double total = Maths.calculate(initial, increase, APR, term);
		System.out.printf("The total will be %.2f", total);
		double month = Maths.month(total, term);
		System.out.printf("The total monthly will be %.2f", month);
	}
	public static class tuition{
		public static void information() {
			System.out.println("Tuition: ");
			initial = input.nextDouble();
			System.out.println("Percentage increase: ");
			increase = input.nextDouble();
			System.out.println("APR: ");
			APR = input.nextDouble();
			System.out.println("Term: ");
			term = input.nextInt();
		}
	}	
}
