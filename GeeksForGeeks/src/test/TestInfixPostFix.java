package test;

import stacks.InfixToPostFix;

public class TestInfixPostFix {
	public static void main(String[] args) {
		String s = "a+b*(c^d-e)^(f+g*h)-i";
		InfixToPostFix i = new InfixToPostFix();
		System.out.println(i.infixToPostFix(s));
	}
}
