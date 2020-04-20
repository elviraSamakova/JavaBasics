package com.syntax.class17;

public class Play {
	private static String countVowels (String s) {
		int a = 0; String f;
		s=s.toLowerCase();
		s = s.replaceAll("[^AEUIOaeuio]", "");
	    a = s.length();
	    
	    for(int i = 0; i < s.Length(); i++) {  
	    }
	    
	    return a;
	}

	// test case below (dont change):
	public static void main(String[] args) {
		System.out.println(countVowels("obama")); // 3
		System.out.println(countVowels("happy friday! i love weekends")); // 9
	}
}
