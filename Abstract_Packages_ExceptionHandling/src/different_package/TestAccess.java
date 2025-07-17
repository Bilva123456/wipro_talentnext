package different_package;
import test_package.Foundation;
class TestAccess {
	    public static void main(String[] args) {
	        Foundation obj = new Foundation();
	        
	        
	        System.out.println(obj.var4);    
	        
	        System.out.println("Only var4 (public) is accessible: " + obj.var4);
	    }
	

	}


