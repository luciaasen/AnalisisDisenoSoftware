package console;

public class ConsoleDemo {
	
	public static void main(String [] args ){
		TextConsole tc = new TextConsole();
		tc.addCommand("Function1", null);
		tc.run();
	}

}
