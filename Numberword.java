//@author SRI HARSHA GANJA
//GANJASH

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Numberword {
	public static void main(String[] args) {

		System.out.println("Enter a positive number");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = str.length();

		// Unit's place
		HashMap<Integer, String> H1 = new HashMap<Integer, String>() {
			{
				put(1, "ONE ");
				put(2, "TWO ");
				put(3, "THREE ");
				put(4, "FOUR ");
				put(5, "FIVE ");
				put(6, "SIX ");
				put(7, "SEVEN ");
				put(8, "EIGHT ");
				put(9, "NINE ");
				put(0, "");
			}
		};

		// 10s place //All teens separated as pronunciation for some different
		HashMap<Integer, String> H2 = new HashMap<Integer, String>() {
			{
				put(10, "TEN ");
				put(11, "ELEVEN ");
				put(12, "TWELVE ");
				put(13, "THIRTEEN ");
				put(14, "FOURTEEN ");
				put(15, "FIFTEEN ");
				put(16, "SIXTEEN ");
				put(17, "SEVENTEEN ");
				put(18, "EIGHTEEN ");
				put(19, "NINETEEN ");
			}
		};

		// 10s place //ALL REMAINING SEPARATED
		HashMap<Integer, String> H22 = new HashMap<Integer, String>() {
			{
				put(2, "TWENTY ");
				put(3, "THIRTY ");
				put(4, "FORTY ");
				put(5, "FIFTY ");
				put(6, "SIXTY ");
				put(7, "SEVENTY ");
				put(8, "EIGHTY ");
				put(9, "NINETY ");
			}
		};

		HashMap<Integer, String> H3 = new HashMap<Integer, String>() {
			{
				put(3, "THOUSAND ");
				put(6, "MILLION ");
				put(9, "BILLION ");
				put(12, "TRILLION ");
				put(15, "QUADRILLION ");
				put(18, "QUINTILLION ");
				put(21, "SEXTILLION ");
				put(24, "SEPTILLION ");
			}
		};

		int i = n;
		String str2 = "";
		while (i > 0) {
			switch (i % 3) {

			case 0:
				if (n > i) // HUNDREDS PLACE
					str2 = str2.concat(H3.get(i));

				str2 = str2.concat(H1.get((int) str.charAt(n - i) - 48));
				str2 = str2.concat("HUNDRED AND ");
				i--;
				break;

			case 2:
				int temp = Integer.parseInt(str.substring(n - i, n - i + 1)); // TEENS
																				// TENS
																				// PLACE
				if (10 <= temp && temp <= 19) {
					str2 = str2.concat(H2.get(temp));
					i -= 2;
					break;
				} else {
					str2 = str2.concat(H22.get(((int)str.charAt(n - i)) - 48)); // OTHERS
																		// TENS
																		// PLACE
					i--;
				}

				break;

			case 1:
				str2 = str2.concat(H1.get(((int) str.charAt(n - i)) - 48)); // UNITS
																	// PLACE
				i--;
				break;

			default:
				break;
			}

		}
		
		System.out.println("THE WORD FORMAT OF NUMBER "+ str/*num*/+" is  :\n" +str2);
		
	}
}
