import java.util.Scanner;

public class CheckDigit {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a credit card number as a long integer: ");
		String cc= input.next();
		
		if(LengthCheck(cc) == true && ValidCard(cc) == true
				&& checkDigits(cc) == true) {
			System.out.println("This card is valid.");
		}
		else {
			System.out.println("This card is invalid.");
		}
		
	}
	
	public static boolean LengthCheck(String cc) {
		if(cc.length() == 13) {
			return true;
		}
		else if (cc.length() == 14) {
			return true;
		}
		else if (cc.length() == 15) {
			return true;
		}
		else if (cc.length() == 16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static boolean ValidCard(String cc){
		if(cc.charAt(0)== '4'){
			// Visa
			return true;
		}
		else if (cc.charAt(0) == '5') {
			// Master Card
			return true;
		}
		else if ((cc.charAt(0) == '3') && (cc.charAt(1) == '7')) {
			// American Express
			return true;
		}
		else if(cc.charAt(0) == '6') {
			//Discover
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean checkDigits(String cc){
		int[] even = new int[8];
		int[] odd = new int [8];
		int sumEven = 0;
		int sumOdd = 0;
		int sum = 0;
		
		// Separating Even and Odd in Arrays
		for(int i= 0; i< cc.length(); i= i + 2) {
			even[i] = (int) cc.charAt(i);
		}
		
		for(int i= 1; i< cc.length(); i= i + 2) {
			odd[i] = (int) cc.charAt(i);
		}
		
		//Step 1 & 2, sum of evens * 2
		for(int i= 0; i< even.length; i++){
			if(even[i] >= 10){
				int right = even[i] % 10;
				int left = even[i] / 10;
				sumEven += (right + left) * 2;
			}
			else {
			sumEven += even[i] * 2;
			}
		}
		
		//Step 3, sum of odds
		for(int i= 0; i< odd.length; i++){
			sumOdd += i;
		}
		
		//Step 4, sum 
		sum= sumEven + sumOdd;
		
		//Step 5, check if divisible by 10
		if(sum%10 == 0) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

}
