package Programs;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	
	public static void main(String[] args)
	{
	
		String a="Java Automation Testing. Automation Testing is a trending area now in market";
		
		
		Map<String,Integer> charCountMap=new HashMap<>();
		
		for(String s: a.split(" "))
		{
			charCountMap.put(s, charCountMap.getOrDefault(s, 0)+1);
		}
		
		System.out.println(charCountMap.size());
		
		
	}
	
		
	 
}
