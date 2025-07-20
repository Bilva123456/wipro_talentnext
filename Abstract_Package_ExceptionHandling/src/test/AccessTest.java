package test;

public class AccessTest {
	public static void main(String[] args) {
        Foundation f = new Foundation();
        
        System.out.println("var4 (public): " + f.var4);
        System.out.println("var2 (default): " + f.var2);
        System.out.println("var3 (protected): " + f.var3);
        
    }
}
