package com.syntax.class17;

public class HomeWork {
public static String getWord (String word) {
	String reverse="";
	for (int i=word.length()-1; i>=0; i--) {
		reverse+=word.charAt(i);
	}
	return reverse;
}

	public static void main(String[] args) {
		String word=HomeWork.getWord("Elvira");
		System.out.println(word);
		System.out.println(HomeWork.getWord("привет"));
	}

}
