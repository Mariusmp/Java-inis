package lt.mariusmp.masyvai;

import java.util.Arrays;

public class syvai {

	public static void main(String[] args) {
		String str1 = "How ";
		String str2 = "do ";
		String str3 = "you ";
		System.out.println(str1 + str2 + str3);
		String fraze = str1 + str2 + str3 + str2;
		System.out.println(fraze);
		String frazyte = str1 + "\n" + str2 + "\"" + str3 + "\"" + str2 + "\\";
		System.out.println(frazyte);

		int[] numbers = new int[10];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 2;
		String intNumbers = Arrays.toString(numbers);
		System.out.println(intNumbers);
		int[] numberai = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(numberai);
		String intNumberaiString = Arrays.toString(numberai);
		System.out.println("Arrays to string panaudojus " + intNumberaiString);
		String str = "An array is a";
		Character[] charObjectArray = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		System.out.println("bandom" + charObjectArray);

		char[] vienadimensisMasyvas1 = "An array is a".toCharArray();
		char[] vienadimensisMasyvas2 = "container object".toCharArray();
		char[][] dvimatis = { vienadimensisMasyvas1, vienadimensisMasyvas2 };
		System.out.println("negeras" + dvimatis);
		System.out.println("geras" + Arrays.deepToString(dvimatis));

	}

}
