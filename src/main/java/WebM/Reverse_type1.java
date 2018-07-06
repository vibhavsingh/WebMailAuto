package WebM;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_type1 {

	public static void main(String[] args) {
		String k = null;
		String s = "Your software testing partner";
		s = " " + s + " ";
		int len = s.length();
		int p = 0;
		int le = 1;
		ArrayList<Integer> arrli = new ArrayList<Integer>(le);
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == ' ') {
				arrli.add(i);

			}

		}
		// System.out.println(arrli);
		// String str=
		for (int j = arrli.size() - 2; j >= 0; j--) {
			String str = s.substring(arrli.get(j), arrli.get(j + 1));
			System.out.print(str);
		}

	}

}
