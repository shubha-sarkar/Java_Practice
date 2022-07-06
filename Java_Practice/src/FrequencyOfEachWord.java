import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfEachWord {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if (!hm.containsKey(arr[i]))
			{
				hm.put(arr[i], (Integer)1);
			}
			else
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
			System.out.println("Number of words: "+arr.length);
			System.out.println("The words are " +hm);
			int maxValueInMap=(Collections.max(hm.values()));  // This will return max value in the Hashmap
			for (Entry<String, Integer> entry : hm.entrySet()) {  // Iterate through HashMap
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println("Maximum occurring word: "+entry.getKey());     // Print the key with max value
	            }
	        }
	}

}

/*Enter the String:
This is programming website whose name is CodezClub
Number of words: 8
The words are {website=1, name=1, CodezClub=1, This=1, is=2, whose=1, programming=1}
Maximum occurring word: is

*/
