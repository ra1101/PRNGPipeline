package numbers;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class RandomSet {

	final int SETSIZE=6;
	final int LEASTDIE=1;
	final int GREATESTDIE=6;
	

/*	public static void main(String[] args) {

			getRandomNumberSet().forEach((k,v) -> System.out.println(k + ", " + v));

	}
*/


	private int getRandomNumberInRange(int min, int max) {
	
		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
		
	}

	public Map<String, Integer> getRandomNumberSet() {
		int randomInt = -1;
		Map <String, Integer> numMap = new HashMap <String, Integer>();
		for (int i = 0; i < SETSIZE; i++) {
			randomInt = getRandomNumberInRange(LEASTDIE,GREATESTDIE);
			numMap.put("N" + Integer.toString(i+1),randomInt);
		}
		return numMap;
	}

	
}

