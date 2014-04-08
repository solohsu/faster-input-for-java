package io.test;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		long rows = 1000000L;
		int cols = 10;
		if (!new File(DataGenerator.intFilePathname).exists()) {
			DataGenerator.generateIntegers(rows, cols);
		}
		if (!new File(DataGenerator.doubleFilePathname).exists()) {
			DataGenerator.generateDoubles(rows, cols);
		}
		System.out.println(rows * cols + " Integers:");
		System.out.println("auto parse:    "
				+ ScannerTest.scanIntegersAutoParsing() / 1000.0 + " seconds");
		System.out
				.println("manual parse:  "
						+ ScannerTest.scanIntegersCustomParsing() / 1000.0
						+ " seconds");
		System.out.println("custom reader: " + ReaderTest.scanIntegers()
				/ 1000.0 + " seconds");

		System.out.println(rows * cols + " Doubles:");

		System.out.println("auto parse:    "
				+ ScannerTest.scanDoublesAutoParsing() / 1000.0 + " seconds");
		System.out.println("manual parse:  "
				+ ScannerTest.scanDoublesCustomParsing() / 1000.0 + " seconds");
		System.out.println("custom reader: " + ReaderTest.scanDoubles()
				/ 1000.0 + " seconds");
	}
}
