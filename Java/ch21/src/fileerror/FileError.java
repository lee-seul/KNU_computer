package fileerror;

import java.io.*;

public class FileError {
	private int[] list;
	private static final int SIZE = 10;
	public FileError() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
			list[i] = i;
		writeList();
	}
	public void writeList(){
		PrintWriter out = null;
		try { 
			out = new PrintWriter(new FileWriter("outfile.txt"));
			for (int i = 0; i < SIZE; i++)
				System.out.println("배열 원소" + i + " = " + list[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundEception: ");
		} catch(IOException e) {
			System.err.println("IOException");
		} finally {
			if (out != null)
				out.close();
		}
	}
	public static void main(String[] args) {
		new FileError();
	}

}
