//Just messing around. Please feel free to join in the "code-jam". Try things out!


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryTranslator {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		try{
		int decimalValue;
		String binary;
		System.out.print("Enter a positive integer: ");
		
		decimalValue = in.nextInt();
		
		if (decimalValue <= 0)
			System.out.println("ERROR: entered integer is nonpositive.");
		else if (decimalValue > 10000)
			System.out.println("ERROR: entered integer to large.");		
		else {
			binary = "";

			while (decimalValue != 0) {
 
				if (binary.length() % 5 == 0)
					binary = " " + binary;
				binary = (decimalValue % 2) + binary;
				decimalValue /= 2;
			}
			System.out.println("Binary: " + binary);
			}
		 }                         
		     catch (InputMismatchException ime) {
		        System.err.println("Caught IOException: " +  ime.getMessage());
		                                 
		    }
	
		 	finally {
		        if (in != null) {
		            System.out.println("Freeing resources, let the GC take care of the rest");
					in.close();
		        } 
		        else {
		            System.out.println("Scanner not open");
		        }
		    }
		}	
	}