
package unit;


public class InvPos {

    
    public static void main(String[] args) {
      	int a = 10;
	int b = 20;
	
	System.out.println("o valor de a é " + a);
	System.out.println("o valor de b é " + b);
	int c = a;
	a = b;
	b = c;
	System.out.println("o valor de a é " + a);
	System.out.println("o valor de b é " + b);
    }
    
}
