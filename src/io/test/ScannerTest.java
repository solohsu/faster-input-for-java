package io.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	public static long scanIntegersAutoParsing() throws FileNotFoundException {
		long start = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				DataGenerator.intFilePathname));
		Scanner scanner = new Scanner(bis);
		long rows = scanner.nextLong();
		int cols = scanner.nextInt();
		for (int i = 0; i < rows * cols; i++) {
			scanner.nextInt();
		}
		scanner.close();
		return System.currentTimeMillis() - start;
	}

	public static long scanIntegersCustomParsing() throws FileNotFoundException {
		long start = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				DataGenerator.intFilePathname));
		Scanner scanner = new Scanner(bis);
		long rows = Long.parseLong(scanner.next());
		int cols = Integer.parseInt(scanner.next());
		for (int i = 0; i < rows * cols; i++) {
			Integer.parseInt(scanner.next());
		}
		scanner.close();
		return System.currentTimeMillis() - start;
	}

	public static long scanDoublesAutoParsing() throws FileNotFoundException {
		long start = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				DataGenerator.doubleFilePathname));
		Scanner scanner = new Scanner(bis);
		long rows = scanner.nextLong();
		int cols = scanner.nextInt();
		for (int i = 0; i < rows * cols; i++) {
			scanner.nextDouble();
		}
		scanner.close();
		return System.currentTimeMillis() - start;
	}

	public static long scanDoublesCustomParsing() throws FileNotFoundException {
		long start = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				DataGenerator.doubleFilePathname));
		Scanner scanner = new Scanner(bis);
		long rows = Long.parseLong(scanner.next());
		int cols = Integer.parseInt(scanner.next());
		for (int i = 0; i < rows * cols; i++) {
			Double.parseDouble(scanner.next());
		}
		scanner.close();
		return System.currentTimeMillis() - start;
	}

}
