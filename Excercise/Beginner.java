ackage Beginner;

	import java.util.Random;

	public class Beginner {

		
		public void runBeginner() {

		System.out.println("Hello World!");

			
			String helloWorld = "Hello World";
			System.out.println(helloWorld);

			
			helloWorld("Hello World!");

			
			System.out.println(helloWorldReturn());

			
			System.out.println("\nTask 5 (Parameters/Operators), add two values via method and parameter: Add 2 + 3 = " + doCalculation(2, 3, true));
			System.out.println("\nTask 6 (Conditionals), include boolean to decide if a calculation is ADD or MULTIPLY: Multiply: 3 * 3 = " + doCalculation(3, 3, false));

			System.out.println("Task 7 (Conditionals 2), result (should be 1): " + doCalculation(1, 0, false));
			System.out.println("Task 7 (Conditionals 2), result (should be 3): " + doCalculation(1, 2, true));

			System.out.println("Task 7 (Conditionals 2), result (should be 3): " + doCalculation(3, 0, false));
			System.out.println("Task 7 (Conditionals 2), result (should be 5): " + doCalculation(0, 5, false));

			
			int numberArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

			System.out.println("\nTask 9 (Arrays), (index 0 and 4), result (should be: 6): " + doCalculation(numberArray[0], numberArray[4], true));
			System.out.println("Task 9 (Arrays), (index 2 and 5), result (should be: 9): " + doCalculation(numberArray[2], numberArray[5], true));
			System.out.println("Task 9 (Arrays), (index 7 and 3), result (should be: 12): " + doCalculation(numberArray[7], numberArray[3], true));
			System.out.println("Task 9 (Arrays), (index 1 and 9), result (should be: 2): " + doCalculation(numberArray[1], numberArray[9], true));

			
			System.out.print("\nTask 10 (Iteration/Arrays), result (should be array of numbers): ");
			printArray(numberArray);

	
			System.out.print("\nTask 11 (Iteration/Arrays), result (should be randomly generated array): ");
			int[] newArray = new int[10];
			newArray = populateArray();
			printArray(newArray);

			System.out.print("Task 11 (Iteration/Arrays), result (should be the array above, multiplied by 10 each time): ");
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] *= 10;
			}
			printArray(newArray);
			
			
			
		}

		
		private static void helloWorld(String param) {
			System.out.println(param);
		}

	
		private static String helloWorldReturn() {
			return "Hello World print";
		}

		private static int doCalculation(int a, int b, boolean add) {
		
			if (a < 1 | b < 1) {
				int zeroCheck = a < 1 ? b : a;
				doIteration(zeroCheck);
				return zeroCheck;
			}

		
			return add ? a + b : a * b;
		}

		
		private static void doIteration(int value) {
		
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Task 8 (Iteration), Result: " + value);
			}
			
		}

		
		private static void printArray(int array[]) {
		
			for (int i : array) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

	
		private static int[] populateArray() {
			int[] a = new int[10];

			Random randomNumberGenerator = new Random();
			for (int i = 0; i < 10; i++) {
				a[i] = randomNumberGenerator.nextInt((9 - 0) + 1);
				
			}

			return a;
		}

	}