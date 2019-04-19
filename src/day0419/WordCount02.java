package day0419;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class WordCount02 {

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
				HashMap<String, Integer> map = new HashMap<String, Integer>();				
				while(st.hasMoreElements())
				{
					String word = st.nextToken();
					Integer cnt = map.get(word);					
					if(cnt == null)
					{
						map.put(word, 1);
					}
					else
					{
						map.put(word, cnt+1);
					}
				}				
				//System.out.print(map);
				Iterator keys = map.keySet().iterator();
				while(keys.hasNext())
				{
					String key =(String) keys.next();
					Integer value = map.get(key);
					System.out.println(key + "\t" + value);
				}
								
				br.close();
				
				System.out.println("프로그램 종료");
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}




