package lt.vtvpmc.ems.akademijait;

public class javaOperatorsBitwise {
	public static void main(String[] args) {
	int a=60;  //*60=0011 1101*/
	int b=13;  //*13=0000 1101*/
	int c=0;   //*va kaip įdomiai čia viskas
	c = a & b; //*12=000 1100*/
	System.out.println("a & b = "+c);
	}
}
