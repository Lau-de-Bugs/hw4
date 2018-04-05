package hw4;
import java.util.*;
import java.io.*;

public class Program {
	public static void main(String[] args) {
		String customerFileName = args[0];
		
		File customerFile = new File("customersfile.txt");
		Scanner in;
		try {
			in = new Scanner(customerFile);
		
		String s = "";
		while (in.hasNext()) {
			s = s + "#" + in.nextLine();
		}
		System.out.println(s);
		} catch (FileNotFoundException e) {
			System.out.print("Invalid file name.");
		}
	}

}
