package WebM;

import java.io.*;

import org.openqa.selenium.ElementNotVisibleException;

public class lineByLine {
	static String[] wo;

	public static void main(String args[]) throws IOException, ElementNotVisibleException {

		String line;
		String filePath = "C:\\Users\\vibhavsingh\\Desktop\\test2.txt";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		// String s=br.readLine();
		while ((line = br.readLine()) != null) {
			wo = line.split(" ");

		}
		for (int i = 0; i < wo.length; i++) {
			System.out.println(wo[i]);
		}
	}
}
