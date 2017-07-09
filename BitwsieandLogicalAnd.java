import java.util.Scanner;
public class BitwsieandLogicalAnd {

	public static void main(String[] args) {
		// program in java to compare the truth table of Bitwise AND and Logical AND.
	    byte a;
		byte b;
		int x;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		a = inp.nextByte();
		System.out.println("Enter the value for b: ");
		b = inp.nextByte();
		// bitwise AND
		x = a & b;
		System.out.println(" The  value of a & b: " + a);
		
		// Logical AND
		if ((++a == a + 1) &&(++b == b + 1)){
			
			System.out.println(" The  value of a && b: " + a + b);
		}
	}

}
