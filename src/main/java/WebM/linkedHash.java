package WebM;

import java.lang.*;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class linkedHash {
	public static void main(String[] args) {
		LinkedHashSet<Character> str = new LinkedHashSet<Character>();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			str.add(c[i]);
		}
		Iterator<Character> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
