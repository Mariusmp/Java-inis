package lt.namudarbassss;

class longExpression {

	public static void main(String[] args) {
		System.out.println(longExpressionas(1, 2, 3));
	}

	public static long longExpressionas(int a, int b, int c) {
		return ((100_000_000_000L % a) >> b) | (100 / c);
	}
}
// liekanos skaičiaus vienetai ir nuliai pasistums per b į dešinę ir nukopijuos
// gautus bitus, jei jie yra keirėje arba dešinėje pusėje