package model1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Ədəd yazn: ");
			String userInput = scanner.nextLine();

			int convertedValue = convertToInteger(userInput);
			System.out.println("Daxil edilmiş ədəd: " + convertedValue);
		} catch (NumberFormatException e) {
			System.out.println("Xəta: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	public static int convertToInteger(String userInput) throws NumberFormatException {
		return Integer.parseInt(userInput);
	}
}
