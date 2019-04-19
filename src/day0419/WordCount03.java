package day0419;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class WordCount03 {

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
				HashSet set = new HashSet();
				while(st.hasMoreElements())
				{
					set.add(st.nextElement());
				}
				
				System.out.print(set.size());
				
								
				br.close();
				
				System.out.println("프로그램 종료");
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}




