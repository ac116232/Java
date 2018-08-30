package chapter1;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte aByte;
        short aShort;
        String name;

        Scanner input = new Scanner(System.in);
        
	     System.out.println("Please enter your name >> ");
	        setaName(input.next());
	     System.out.println("Please enter an byte >> ");
	        setaByte(input.nextByte());
	     System.out.println("Please enter an short >> ");
	        setaShort(input.nextShort());
	     
		
		
		
		
		
		
		
		
		
		
		
	}

	public static byte getaByte() {
		return aByte;
	}

	public static void setaByte(byte aByte) {
		FreeLance.aByte = aByte;
	}

	public static short getaShort() {
		return aShort;
	}

	public static void setaShort(short aShort) {
		FreeLance.aShort = aShort;
	}

	public static String getaName() {
		return aName;
	}

	public static void setaName(String aName) {
		FreeLance.aName = aName;
	}

}
