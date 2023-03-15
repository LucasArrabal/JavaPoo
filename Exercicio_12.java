public class Main
{
	public static void main(String[] args) {
	    String S1 = new String("8");
	    String S2 = null;
	    S2 = "8"+"5";
	    String S3 = null;
	    S3 = ("5" + "7").concat(S1);
	    
	    int x = Integer.parseInt(S2);
	    int y = Integer.parseInt(S1 + S2);
	    int z = Integer.parseInt(S3);


	    System.out.println(x+y+z);

	}
}
