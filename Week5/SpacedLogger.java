package Week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
	StringBuilder spaces = new StringBuilder("");  
		 for ( int i = 0; i < log.length(); i++) {
			 spaces.append(log.charAt(i));
			 spaces.append(" "); 
		 }
		 System.out.println(spaces.toString()); 
	
		
	}

	@Override
	public void error(String error) {
		StringBuilder spaces = new StringBuilder("");  
		 for ( int i = 0; i < error.length(); i++) {
			 spaces.append(error.charAt(i));
			 spaces.append(" "); 
		 }
		 System.out.println("ERROR: " + spaces.toString()); 
		
	}

}
