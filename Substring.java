//@author SRI HARSHA GANJA
//GANJASH

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {
	public static void main(String[] args) {

		System.out.println("Print Main String");
		String A = "abcdabcdaabbcdbccddaabcd";
		String a = "abcd";
		int sn = a.length();

		int n = A.length();
		int match = 0,j=0;
		int count = 0;
		int arr_pos[] = new int[n];
		for(int i = 0;i < n ; i++){
			if(A.charAt(i) == a.charAt(j)){
				match++;
				j++;
				if(match == sn){
					count++;
					match=0;
					arr_pos[count -1] = i - sn + 1;
					j=0;
				}
			}
			else{
				if(A.charAt(i) == a.charAt(0)){
					j=1;
					match=1;
					continue;
				}
				j=0;
				match=0;
			}
		}
		System.out.println("Given String : "+A);
		System.out.println("Given sub String : "+a);
		for( int i : arr_pos)
		System.out.println("Position of indices : "+i);
	
	}
}
