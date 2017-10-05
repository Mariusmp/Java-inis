package lt.namudarbassss;

class doubleExpression {
	public static void main(String[] args) {
		System.out.println(doubleExpressionas(1.5d, 2.5d, 3.5d));
	}

	public static boolean doubleExpressionas(double a, double b, double c) {
		return (Math.abs(c - (a + b)) <= 1);
		// 1E-4);
		// patikrins, ar rezultato absoliuti reikšmė yra mažiau arba lygu
	}
}
