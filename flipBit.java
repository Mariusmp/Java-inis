package lt.namudarbassss;

class flipBit {
	public static void main(String[] args) {
		System.out.println(flipBitas(1, 2));
	}

	public static int flipBitas(int value, int bitIndex) {
		int x = bitIndex - 1;
		int y = 1 << x;
		return value ^ y;
	}
}
// pastums binary kodą per x-1 skaičių į kairę, palygins su value ir kas
// nesutaps, tą nukopijuos 1-0001 2-0010 3-0011