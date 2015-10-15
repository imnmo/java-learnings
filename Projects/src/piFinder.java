import java.util.Scanner;

/*
 * This program will generate PI for a given number,
 * upto many decimal places.
 *
 *@author: mohamedi
 *
 */

public class piFinder {

	private int inputValue=0;
	Scanner input = new Scanner(System.in);

	/**
	 *
	 * This method expects an input user integer input,
	 * else error message  is thrown
	 */
	public void getInput(){

		try{
		System.out.println("PLease Enter a value:");
		inputValue = input.nextInt();
		System.out.println(inputValue);
		}
		catch(Exception ex){
			System.out.println("NO/WRONG USER INPUT");
		}
		finally {
			input.close();
		}
	}


}
