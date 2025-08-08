package Exceptionhandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		try{
			int i =9/0;
		}
		
		catch(Exception e) {
			 System.out.println(e.getMessage());
		   }
		
		
		finally {
			   System.out.println("Im in finally block");
		   }

	}
	
	
}
