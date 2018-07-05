package WebM;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SortByoccur {
	public static void main(String[] args)
			throws IOException {/*
								 * Scanner sc=new Scanner(System.in); String s=sc.nextLine();
								 */
		Path wiki_path = Paths.get("C:\\Users\\vibhavsingh\\Desktop\\test2.txt");
		String data = new String(Files.readAllBytes(wiki_path));
		LinkedHashSet<Character> c = new LinkedHashSet<Character>();
		char[] chr = data.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			c.add(chr[i]);
			// System.out.println(chr[i]);
		}
		String str = "";
		Iterator<Character> itr = c.iterator();
		while (itr.hasNext()) {
			str += itr.next();
		}
		// SEction above works correctly
		// System.out.println(str);
		/*
		 * int coun=0; str=str.toLowerCase(); data=data.toLowerCase(); for(int
		 * i=0;i<str.length();i++) { for(int j=0;j<data.length();j++) { int
		 * x=data.indexOf(str.charAt(i)); char cp=data.charAt(x); if(x!=-1) {coun++;
		 * cp='@'; }
		 * 
		 * 
		 * }
		 */
		int coun;
		for(int i=0;i<str.length();i++)
		 { coun=0;
			 for(int j=0;j<data.length();j++)
			 {
				 if(str.charAt(i)==data.charAt(j))
					 coun++;
			 }
		 System.out.println(str.charAt(i)+":"+coun);
		 }

	}
}
