public class Main
{
	public static void main(String[] args) {
	    String a = new String("Hello");
	    String b = new String(a+"USCS");
	    String c = new String("a".concat(b));
		System.out.println(c);
	}
}
