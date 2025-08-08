package Exceptionhandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		System.out.println("A");
		
		try{
			int i =9/0;
			
			System.out.println("ABC");
			
			int p[] = new int[2];
			
			p[0]=100;
			p[1]=200;
			p[3]=300;
		}
		
		
		  catch(ArithmeticException e){
		  
		  System.out.println(e.getMessage());
		  
		  e.printStackTrace(); 
		  }
		 

		catch(ArrayIndexOutOfBoundsException e){
			
		}
		
		catch(NullPointerException e){
			
		}
		
		System.out.println("A");
	}

}
