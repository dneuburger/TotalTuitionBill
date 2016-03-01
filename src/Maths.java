import java.lang.Math;
public class Maths {
	public static double calculate(double initial, double increase, double APR, double term) {
		double total = 0;
		for (int i = 4; i > 0; i--) {
			double price = initial;
			initial *= (1+increase);
			total += price;
		}
		total = total * Math.pow((1+APR/12), (12*term));
		return total;
	}
	public static double month(double total, double term) {
		double month = total / (12 * term);
		return month;
	}
}
