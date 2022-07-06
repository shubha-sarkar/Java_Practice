import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

public class TestShubha {

	public static void main(String[] args) {
		
		String str = "Shubha Sarkar";

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(!hm.containsKey(c))
			{
				hm.put(c, 1);
			}
			else
			{
				hm.put(c, hm.get(c)+1);
			}
		}
		
		System.out.println(hm);
		System.out.println(Collections.max(hm.values()));
		
		int maxValueInHashMap = Collections.max(hm.values());
		
		for(Entry<Character,Integer> entry : hm.entrySet())
		{
			if(entry.getValue()==maxValueInHashMap)
			{
				System.out.println(entry.getKey());
			}
		}
		
	}

}
