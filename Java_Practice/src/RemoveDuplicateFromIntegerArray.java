import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicateFromIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 6, 7, 2, 2, 1, 1, 5 , 4 , 7 , 3, 8 , 7, 8 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (Integer value : arr) {
			hs.add(value);
		}

		TreeSet<Integer> ts = new TreeSet<Integer>(hs);
		System.out.println(ts);

	}

}
