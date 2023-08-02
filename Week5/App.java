package Week5;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger(); 
		
		logger.log("Hello"); 
		logger.error("Hello World");
		
		Logger logger2 = new SpacedLogger(); 
		
		logger2.log("Hello World");
		logger2.error("Hello World");

	}

}
