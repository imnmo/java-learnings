package Collections;

import java.util.*;

public class TryList {

	public static void main(String [] args){

	    //Rememeber always the list maintains an ordering

		List<Integer> myList = new ArrayList<>();

	    myList.add(6);
		myList.add(2);
		myList.add(4);
		myList.add(5);


		for (Integer i: myList)
		{

			System.out.println(i);

		}


	}

}
