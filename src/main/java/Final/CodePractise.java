package Final;



public class CodePractise {
	
	    void show() {
	        System.out.println("Parent class method");
	    }
	}
	 
	class Child extends CodePractise {
	    @Override
	    void show() {
	        System.out.println("Child class method");
	    }
	}
	 
	 class Test {
	    public static void main(String[] args) {
	        CodePractise obj = new Child();
	        obj.show();
	    }
	

	
	 }
		
		
	      

	
