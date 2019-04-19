package day0419;

import java.io.FileReader;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String fname = args[0];
			try {
				FileReader fr = new FileReader(fname);
				int ch;
				while((ch= fr.read())!=-1)
				{
						System.out.print((char)ch);
				}
				fr.close();								
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
}
