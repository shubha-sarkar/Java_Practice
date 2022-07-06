//Find the count of words using HashMap
//This question was asked in IBM assessment(HackerRank)
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class WordCountHashMap {
	


	public static void main(String[] args) {

		String strString = "My name is Shubha Sarkar";
		int wordCount=getWordCount(strString);
		System.out.println(wordCount);

	}

	public static int getWordCount(String strString) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String[] words = strString.split(" ");
		for (String word : words) {
			if (hashMap.containsKey(word))
				hashMap.put(word, hashMap.get(word) + 1);

			else
				hashMap.put(word, 1);
		}
		int count = 0;
		Set<String> keys = hashMap.keySet();
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		for (String str : sortedKeys) {
			count = count + hashMap.get(str);
		}
		return count;

	}

	

}
