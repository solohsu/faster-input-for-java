package io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DataGenerator {

	final static String intFilePathname = "integers.dat";
	final static String doubleFilePathname = "doubles.dat";

	final static Random r = new Random();

	static void generateIntegers(long rows, int cols) throws IOException {
		FileWriter fw = new FileWriter(intFilePathname);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(String.valueOf(rows));
		bw.write(' ');
		bw.write(String.valueOf(cols));
		bw.write('\n');
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				bw.write(String.valueOf(r.nextInt()));
				bw.write(' ');
			}
			bw.write('\n');
		}
		bw.flush();
		bw.close();
	}

	static void generateDoubles(long rows, int cols) throws IOException {
		FileWriter fw = new FileWriter(doubleFilePathname);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(String.valueOf(rows));
		bw.write(' ');
		bw.write(String.valueOf(cols));
		bw.write('\n');
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				bw.write(String.valueOf(r.nextDouble()));
				bw.write(' ');
			}
			bw.write('\n');
		}
		bw.flush();
		bw.close();
	}

}
