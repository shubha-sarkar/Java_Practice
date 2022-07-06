import java.util.HashMap;
import java.util.Map.Entry;

public class TestShubha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabcc";
		//output: a3b1c2
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(!hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), 1);
			}
			else
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		System.out.println(hm);
		
		for(Entry<Character,Integer> entry : hm.entrySet())
		{
			System.out.print(entry.getKey()+""+entry.getValue());
		}
		

	}

}
