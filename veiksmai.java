package lt.vtvpmc.ems.akademijait;

public class veiksmai {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a=" + a + "; b=" + b + "; c=" + c + "; d=" + d);
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a*b=" + (a * b));
		System.out.println("b/a=" + (b / a));
		System.out.println("a/b be double, šaltiniai int, rodo tik sveiką skaičių =" + (a / b));
		System.out.println("a/b su double, nes be double b*** gaunas =" + ((double) a / b));
		System.out.println("liekana padalinus b%a=" + (b % a));
		System.out.println("liekana padalinus c%a=" + (c % a));
		System.out.println("liekana padalinus a/b=" + (a % b));
		System.out.println("a++ =" + (a++));
		System.out.println("o dabar a pasidarė " + a);
		System.out.println("b--=" + (b--));
		System.out.println("o dabar b pasidarė " + b);
		System.out.println("d++=" + (d++));
		System.out.println("o dabar d pasidarė " + d);
		d = 25;
		System.out.println("nuresetinam - d=" + d);
		System.out.println("++d=" + (++d));
		c = 0;

	}

}
