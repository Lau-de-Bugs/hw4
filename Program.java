package hw4;
import java.util.*;
import java.io.*;

public class Program {
	public static void main(String[] args) throws IOException {
		String customerFileName = args[0];

		try {
			FileReader customerFile = new FileReader(customerFileName);
			BufferedReader in = new BufferedReader(customerFile);


			String s = "";
			while (in.readLine()!=null) {
				s = s + "#" + in.readLine();
			}
			System.out.println(s);
		} catch (FileNotFoundException e) {
			System.out.print("Invalid file name.");
		}
	}

}
