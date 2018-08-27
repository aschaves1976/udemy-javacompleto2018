package util;

public class CurrencyConverter {
	public static final double IOF = (double) 6 / 100;

	public static double conversion(double price, double qtdToBuy) {
		double calc = price * qtdToBuy;
		calc += calc * IOF;
		return calc;
	}

}
