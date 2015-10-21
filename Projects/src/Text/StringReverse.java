package Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * author: mohamedi
 *
 *This program reverses the given input
 * string
 *
 * Problem : Reverse a String - Enter a string and the
 * program will reverse it and print it out.
 */

public class StringReverse {

	private String _inputValue="" ;
    Scanner input = new Scanner(System.in);

    /*
     * Handles the given input
     * from the console
     */

	public void inputHandler(){

        try{
        System.out.println("Please Enter a value:");
        _inputValue = input.next();
        }
        catch(Exception ex){
            System.out.println("NO OR WRONG USER INPUT");
        }
        finally {
            input.close();
        }

        stringReverser(_inputValue);

	}

	/* Reverses the given input based on
	 * the user input
	 *
	 */
	public void stringReverser(String pInput){
		for (char s: pInput.toCharArray()){

			System.out.println(s);
			}
	}
}
