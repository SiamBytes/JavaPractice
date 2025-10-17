package com.javapractice;

public class ReverseString {
	public static void main (String[] args) {
		String input = "I miss you";
		String reversed = "";
		
		//Reverse string without using reverse()
		for(int i = input.length() - 1; i >= 0 ; i--) {
			reversed += input.charAt(i);
		}
		
		System.out.println("Input: " + input);
		System.out.println("Reverse: " + reversed);
	}
}
