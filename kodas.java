package lt.namudarbassss;

class kodas {

	public static void main(String[] args) {
		System.out.println(kodasas(true, false, false));
	}

	public static boolean kodasas(boolean a, boolean b, boolean c) {
		return ((c & false) | (a ^ b));
	}
}

// jei c ir tas teisingas, tai true, jei ne - parodys a^b
// patikrins, ar rezultato absoliuti reikšmė yra mažiau arba lygu
