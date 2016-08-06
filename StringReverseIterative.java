import java.util.*;

class StringReverseIterative{

	public static void main(String args[]){

		String str="This is the String to Reverse";

		// call to reverseString method
		String resultString = reverseString(str);

		System.out.println(resultString);

	}


	//iterative function to reverse a string

	public static String reverseString(String str){

		StringBuilder resultString = new StringBuilder();

		int length = str.length();

	// this is the logic to add character to StringBuilder
		for(int i=length-1;i>=0;i--){

			resultString.append(str.charAt(i));


		}

		return resultString.toString();

	}

	// toString() converts the string builder to String
}