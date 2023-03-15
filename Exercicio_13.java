public class Main
{
	public static void main(String[] args) {
        boolean x = 5 == 7;
        boolean y = false == (1>= 1);
        if(x == y){
            System.out.println("USCS");
        }else{
            if(x != y){
                System.out.println("Comp");
            }else{
                System.out.println("Algoritmo");
            }
        }


	}
}
