package Exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try{
			throw new Exception("RAJESHEXCEPTION");
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
	 
 }
	}

}
