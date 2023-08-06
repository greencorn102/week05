package w5;
import java.io.*;
import java.util.Scanner;

public interface Logger {
	static void log(String st) {}
	static void error(String st) {}
	
}

class AsteriskLogger implements Logger {

	static void log(String st) {

		System.out.print("***" + st + "***" +"\n");

	}
	
	
	static void error(String st) {
		System.out.println("****************");
		System.out.println("***Error:" + st + "***");
		System.out.println("****************");

	}
	

}

class SpacedLogger implements Logger {
	static void log(String st) {
		for (int i=0; i< st.length(); i++) {
			System.out.print(st.charAt(i) + " ");
			
		}
		System.out.print("\n");

	}
	
	
	static void error(String st) {
		System.out.print("ERROR:");
		for (int i=0; i< st.length(); i++) {
			System.out.print(st.charAt(i) + " ");
				
			}
	
		}


}



