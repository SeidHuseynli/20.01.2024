package model1;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Birinci ədədi yazn : ");
			int num1 = scanner.nextInt();

			System.out.print("İkinci ədədi yazn : ");
			int num2 = scanner.nextInt();

			try {
				checkNumbers(num1, num2);
				System.out.println("Ədədlər qoşa bilməyiniz üçün istisna yaranmamışdır.");
			} catch (NegativeNumberException e) {
				System.out.println("Xəta: " + e.getMessage());
			}
		}
	}

	public static void checkNumbers(int num1, int num2) throws NegativeNumberException {
		if (num1 < 0 || num2 < 0) {
			throw new NegativeNumberException("Ədədlər menfi ola bilməz");
		}

	}
}
