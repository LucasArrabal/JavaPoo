public class Main
{
	public static void main(String[] args) {
	    String S1 = new String("ab");
	    String S2 = null;
	    S2 = "xy";
	    String S3 = new String("***".concat(S2.concat("***")));
	    
	    System.out.println(S1+S2+S3);

	}
}
