package com.gl.DSAlgorithmsGradedLab3;
import java.util.*;

public class BalancedBracket {

	public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop(); 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }

 public static void main (String[] args) {
	 System.out.println("Enter the sequence of balance brackets : ");
		try (Scanner sc = new Scanner(System.in)) {
			String bracSeq = sc.nextLine();
			System.out.println("Hello, you have entered the bracket sequence as :  " + bracSeq);

			if(isValid(bracSeq)==true)
			//if(isValid(s)==true)
			System.out.println("This is a balanced bracket sequence");
			else
			System.out.println("This is not a balanced bracket sequence	");
		}
	}
}

