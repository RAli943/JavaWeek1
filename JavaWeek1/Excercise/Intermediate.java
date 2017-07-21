

import java.util.ArrayList;
import java.util.Collections;

public class Intermediate {

	
	public void runTasks() {

		System.out.println("Task 12 (Blackjack), result (should be 21): " + pickClosest(18, 21)); // 21
		System.out.println("Task 12 (Blackjack), result (should be 20): " + pickClosest(20, 18)); // 20
		System.out.println("Task 12 (Blackjack), result (should be 0): " + pickClosest(22, 22)); // 0
		System.out.println("Task 12 (Blackjack), result (should be 21): " + pickClosest(20, 21)); // 21
		System.out.println("Task 12 (Blackjack), result (should be 20): " + pickClosest(20, 20)); // 20

		System.out.println("\nTask 13 (Unique Sum), result (should be 6): " + uniqueSum(1, 2, 3)); // 6
		System.out.println("Task 13 (Unique Sum), result (should be 0): " + uniqueSum(3, 3, 3)); // 0
		System.out.println("Task 13 (Unique Sum), result (should be 2): " + uniqueSum(1, 1, 2)); // 2

		System.out.println("\nTask 14 (Summer), result (should be true): " + inRange(70, false)); // True
		System.out.println("Task 14 (Summer), result (should be false): " + inRange(91, false)); // False
		System.out.println("Task 14 (Summer), result (should be false): " + inRange(70, true)); // False
		System.out.println("Task 14 (Summer), result (should be true): " + inRange(91, true)); // True
		System.out.println("Task 14 (Summer), result (should be false): " + inRange(59, true)); // False
		System.out.println("Task 14 (Summer), result (should be true): " + inRange(101, true)); // True
		

	}

	
	private int pickClosest(int a, int b) {
		return (a > 21 && b > 21) ? 0 : (a > b) ? a : b;
	}



	private int uniqueSum(int a, int b, int c) {

		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(a);
		numberList.add(b);
		numberList.add(c);

		System.out.print("Task 13 (Unique Sum), original list: " + numberList);

		int aOccurences = Collections.frequency(numberList, a);
		int bOccurences = Collections.frequency(numberList, b);
		int cOccurences = Collections.frequency(numberList, c);

		if (aOccurences > 1) {
			numberList.remove((Object) a);
		}
		if (bOccurences > 1) {
			numberList.remove((Object) b);
		}
		if (cOccurences > 1) {
			numberList.remove((Object) c);
		}
		System.out.println(", mutilples removed: " + numberList);

		int total = 0;
		for (int i = 0; i < numberList.size(); i++) {
			total += numberList.get(i);
		}

		return total;
	}

	
	private boolean inRange(int temp, boolean isSummer) {

		if (isSummer) {
			if (temp > 60 && temp < 100) {
				return true;
			}

			return false;
		} else {
			if (temp > 60 && temp < 90) {
				return true;
			}

			return false;
		}

	}
}
