import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Display a menu with options to perform various operations
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Demonstrate Immutability");
			System.out.println("2. Use CharSequence Interface");
			System.out.println("3. Simple Text Editor using StringBuffer");
			System.out.println("4. StringBuilder Text Manipulations");
			System.out.println("5. Performance Comparison of StringBuilder and StringBuffer");
			System.out.println("6. Case Conversion Comparison");
			System.out.println("7. Character Array Search");
			System.out.println("8. String Concatenation and Character Retrieval");
			System.out.println("9. Word Replacement in Sentences");
			System.out.println("10. Interactive String Explorer");
			System.out.println("11. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				demonstrateImmutability();
				break;
			case 2:
				useCharSequenceInterface();
				break;
			case 3:
				simpleTextEditorUsingStringBuffer(scanner);
				break;
			case 4:
				stringBuilderTextManipulations(scanner);
				break;
			case 5:
				performanceComparisonStringBuilderStringBuffer();
				break;
			case 6:
				caseConversionComparison(scanner);
				break;
			case 7:
				characterArraySearch(scanner);
				break;
			case 8:
				stringConcatenationAndCharacterRetrieval(scanner);
				break;
			case 9:
				wordReplacementInSentences(scanner);
				break;
			case 10:
				interactiveStringExplorer(scanner);
				break;
			case 11:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 11);

		scanner.close();
	}

	public static void demonstrateImmutability() {
		String str = "hello";
		String modifiedStr = str.concat(" world");
		System.out.println("Original string: " + str);
		System.out.println("Modified string: " + modifiedStr);
	}

	public static void useCharSequenceInterface() {
		CharSequence charSeq = "hello";
		System.out.println("\nCharSequence:");
		System.out.println("Length: " + charSeq.length());
		System.out.println("Character at index 1: " + charSeq.charAt(1));
		System.out.println("Subsequence from index 1 to 3: " + charSeq.subSequence(1, 3));
	}

	public static void simpleTextEditorUsingStringBuffer(Scanner scanner) {
		StringBuffer text = new StringBuffer();

		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Append text");
			System.out.println("2. Insert text");
			System.out.println("3. Delete text");
			System.out.println("4. Reverse text");
			System.out.println("5. Replace text");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter text to append: ");
				text.append(scanner.nextLine());
				break;
			case 2:
				System.out.print("Enter index to insert: ");
				int index = scanner.nextInt();
				System.out.print("Enter text to insert: ");
				String insertText = scanner.next();
				text.insert(index, insertText);
				break;
			case 3:
				System.out.print("Enter start index to delete: ");
				int startIndex = scanner.nextInt();
				System.out.print("Enter end index to delete: ");
				int endIndex = scanner.nextInt();
				text.delete(startIndex, endIndex);
				break;
			case 4:
				text.reverse();
				break;
			case 5:
				System.out.print("Enter start index to replace: ");
				int replaceStart = scanner.nextInt();
				System.out.print("Enter end index to replace: ");
				int replaceEnd = scanner.nextInt();
				System.out.print("Enter replacement text: ");
				String replacement = scanner.next();
				text.replace(replaceStart, replaceEnd, replacement);
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Current text: " + text);
			System.out.println("Capacity: " + text.capacity());
			System.out.println("Length: " + text.length());
		} while (choice != 6);
	}

	public static void stringBuilderTextManipulations(Scanner scanner) {
		StringBuilder text = new StringBuilder();
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Add substring at position");
			System.out.println("2. Remove range of characters");
			System.out.println("3. Modify character at index");
			System.out.println("4. Concatenate another string");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter position to add: ");
				int position = scanner.nextInt();
				System.out.print("Enter substring to add: ");
				String substring = scanner.next();
				text.insert(position, substring);
				break;
			case 2:
				System.out.print("Enter start index to remove: ");
				int startIndex = scanner.nextInt();
				System.out.print("Enter end index to remove: ");
				int endIndex = scanner.nextInt();
				text.delete(startIndex, endIndex);
				break;
			case 3:
				System.out.print("Enter index to modify: ");
				int index = scanner.nextInt();
				System.out.print("Enter character to replace with: ");
				char newChar = scanner.next().charAt(0);
				text.setCharAt(index, newChar);
				break;
			case 4:
				System.out.print("Enter string to concatenate: ");
				String concatStr = scanner.next();
				text.append(concatStr);
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Current string: " + text);
		} while (choice != 5);
	}

	public static void performanceComparisonStringBuilderStringBuffer() {
		String baseString = "Hello";
		int numConcatenations = 10000;

		long startTimeStringBuilder = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numConcatenations; i++) {
			sb.append(baseString);
		}
		long endTimeStringBuilder = System.currentTimeMillis();
		long timeTakenStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
		System.out.println("Using StringBuilder...");
		System.out.println("Time taken: " + timeTakenStringBuilder + " milliseconds");
		System.out.println("Final string length: " + sb.length());

		long startTimeStringBuffer = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < numConcatenations; i++) {
			stringBuffer.append(baseString);
		}
		long endTimeStringBuffer = System.currentTimeMillis();
		long timeTakenStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
		System.out.println("Using StringBuffer...");
		System.out.println("Time taken: " + timeTakenStringBuffer + " milliseconds");
		System.out.println("Final string length: " + stringBuffer.length());

		long timeDifference = Math.abs(timeTakenStringBuilder - timeTakenStringBuffer);
		System.out.println(
				"Comparison: " + (timeTakenStringBuilder < timeTakenStringBuffer ? "StringBuilder" : "StringBuffer")
						+ " was faster than "
						+ (timeTakenStringBuilder < timeTakenStringBuffer ? "StringBuffer" : "StringBuilder") + " by "
						+ timeDifference + " milliseconds.");
	}

	public static void caseConversionComparison(Scanner scanner) {
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		String str1Lower = str1.toLowerCase();
		String str2Lower = str2.toLowerCase();
		String str1Upper = str1.toUpperCase();
		String str2Upper = str2.toUpperCase();

		boolean isEqualIgnoreCase = str1Lower.equals(str2Lower);

		System.out.println("\nConverted strings:");
		System.out.println("String 1 Lowercase: " + str1Lower);
		System.out.println("String 2 Lowercase: " + str2Lower);
		System.out.println("String 1 Uppercase: " + str1Upper);
		System.out.println("String 2 Uppercase: " + str2Upper);
		System.out.println("Case-insensitive equality: " + isEqualIgnoreCase);
	}

	public static void characterArraySearch(Scanner scanner) {
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		System.out.print("Enter a character to search: ");
		char searchChar = scanner.next().charAt(0);

		char[] charArray = inputString.toCharArray();

		int firstIndex = -1;
		int lastIndex = -1;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == searchChar) {
				if (firstIndex == -1) {
					firstIndex = i;
				}
				lastIndex = i;
			}
		}

		System.out.println("\nCharacter array: " + new String(charArray));
		if (firstIndex != -1 && lastIndex != -1) {
			System.out.println("First occurrence of '" + searchChar + "' at position: " + firstIndex);
			System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastIndex);
		} else {
			System.out.println("Character '" + searchChar + "' not found in the string.");
		}
	}

	public static void stringConcatenationAndCharacterRetrieval(Scanner scanner) {
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		String concatenatedStringMethod = str1.concat(str2);
		String concatenatedStringOperator = str1 + str2;

		System.out.println("\nConcatenation using string method: " + concatenatedStringMethod);
		System.out.println("Concatenation using + operator: " + concatenatedStringOperator);

		System.out.print("\nEnter an index number: ");
		int index = scanner.nextInt();

		if (index >= 0 && index < concatenatedStringMethod.length()) {
			char charAtIndex = concatenatedStringMethod.charAt(index);
			System.out.println("Character at index " + index + ": " + charAtIndex);
		} else {
			System.out.println("Invalid index.");
		}
	}

	public static void wordReplacementInSentences(Scanner scanner) {
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();
		System.out.print("Enter the word to search for: ");
		String searchWord = scanner.next();
		System.out.print("Enter the word to replace it with: ");
		String replaceWord = scanner.next();

		int startIndex = sentence.indexOf(searchWord);
		int endIndex = startIndex + searchWord.length();

		String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(endIndex);

		System.out.println("\nOriginal sentence: " + sentence);
		System.out.println("Modified sentence: " + modifiedSentence);
	}

	public static void interactiveStringExplorer(Scanner scanner) {
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Convert to lowercase");
			System.out.println("2. Convert to uppercase");
			System.out.println("3. Search for a character/index");
			System.out.println("4. Concatenate with another string");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.println("Lowercase: " + inputString.toLowerCase());
				break;
			case 2:
				System.out.println("Uppercase: " + inputString.toUpperCase());
				break;
			case 3:
				System.out.print("Enter a character/index to search: ");
				String searchInput = scanner.nextLine();
				if (searchInput.length() == 1) {
					char searchChar = searchInput.charAt(0);
					int index = inputString.indexOf(searchChar);
					if (index != -1) {
						System.out.println("Character '" + searchChar + "' found at index: " + index);
					} else {
						System.out.println("Character '" + searchChar + "' not found.");
					}
				} else {
					int index = Integer.parseInt(searchInput);
					if (index >= 0 && index < inputString.length()) {
						char charAtIndex = inputString.charAt(index);
						System.out.println("Character at index " + index + ": " + charAtIndex);
					} else {
						System.out.println("Invalid index.");
					}
				}
				break;
			case 4:
				System.out.print("Enter a string to concatenate: ");
				String concatString = scanner.nextLine();
				System.out.println("Concatenated string: " + inputString.concat(concatString));
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 5);
	}
}
