package test;

import stacks.LengthOfLongestValidSubstring;

public class TestLongestValidSubstring {
	
	public static void main(String[] args) {
		LengthOfLongestValidSubstring lvs = new LengthOfLongestValidSubstring();
		String s = "(((()))))()";
		int l = lvs.getLengthOfLongestValidParanthesis(s.toCharArray());
		System.out.println(l);
	}
}
