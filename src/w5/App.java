package w5;

public class App {

	public static void main(String[] args) {
		AsteriskLogger al= new AsteriskLogger();
		SpacedLogger sl = new SpacedLogger();
		al.log("hello");
		al.error("hello");
		
		sl.log("bye");
		sl.error("bye");
		// TODO Auto-generated method stub

	}

}
