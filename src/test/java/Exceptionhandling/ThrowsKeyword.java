package Exceptionhandling;

import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) {
		 
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.launchbrowser();

	}
	
	public void launchbrowser() {
		System.out.println("Launch Browser");
		
			checkOS();
		
	}
	public void checkOS() {
		System.out.println("Check OS");
		checkversion();
	}
	
	public void checkversion() {
		System.out.println("Check Version");
		
			try{
			checkfiles();
		}
		
		catch(ArithmeticException e) {
			System.out.println("some error");
			e.printStackTrace();
		}
			
			catch(NullPointerException e) {
				System.out.println("some error");
				e.printStackTrace();
			} 
			
			catch (FileNotFoundException e) {

				e.printStackTrace();
			}
	}
	
	public void checkfiles() throws ArithmeticException, NullPointerException, FileNotFoundException{
		System.out.println("Check Files");
		
		int i=9/2;
		
		ThrowsKeyword o1 = null;
		
		o1.checkfiles();
		
		
	}
}
