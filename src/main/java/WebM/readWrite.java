package WebM;

import java.io.*;
public class readWrite {
public static void main(String[] args) throws IOException
{
	String line=null;
	String fileName="C:\\Users\\vibhavsingh\\Desktop\\hR.html";
	try {
	FileReader fr=new FileReader(fileName);
	BufferedReader br=new BufferedReader(fr);
	while((line=br.readLine())!=null)
{
	System.out.println(line);
}
	br.close();  
	}
	
	catch(FileNotFoundException ex)
	{
		ex.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

	
	
	
	
	//br.close();  
}
}
