public class Main
{
	public static void main(String[] args) {
        int x = Integer.parseInt("2");
        int y = Integer.parseInt("5");
        int z = Integer.parseInt("8");
        
        int trab;
        
        if(x>y)
            if(x>z)
                trab = x;
            else trab = z;
        else
            if(y>z)
                trab = y;
            else trab = z;
        System.out.println(trab); 
	}
}
