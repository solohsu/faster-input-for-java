package io.test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReaderTest {
	public static long scanIntegers() throws IOException {
		long start = System.currentTimeMillis();
		Reader.init(new FileInputStream(DataGenerator.intFilePathname));
		long rows = Reader.nextLong();
		int cols = Reader.nextInt();
		for (int i = 0; i < rows * cols; i++) {
			Reader.nextInt();
		}
		Reader.close();
		return System.currentTimeMillis() - start;
	}

	public static long scanDoubles() throws IOException {
		long start = System.currentTimeMillis();
		Reader.init(new FileInputStream(DataGenerator.doubleFilePathname));
		long rows = Reader.nextLong();
		int cols = Reader.nextInt();
		for (int i = 0; i < rows * cols; i++) {
			Reader.nextDouble();
		}
		Reader.close();
		return System.currentTimeMillis() - start;
	}
}
