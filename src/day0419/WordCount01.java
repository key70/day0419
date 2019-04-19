package day0419;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class WordCount01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFname = args[0];
		try {
				BufferedReader br = new BufferedReader(new FileReader(sourceFname));
				String lineData;
				StringBuffer sb = new StringBuffer();
				
				while((lineData=br.readLine())!=null)
				{
					sb.append(lineData);
				}
				
				String data = sb.toString();
				
				StringTokenizer st = new StringTokenizer(data);
				System.out.println(st.countTokens());
								
				br.close();
				
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}




