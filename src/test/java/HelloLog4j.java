import org.apache.log4j.Logger;

public class HelloLog4j {

	private static Logger logger = Logger.getLogger(HelloLog4j.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("This is println message.");
		
		// ??debug?????
		logger.debug("This is debug message.");
		// ??info?????
		logger.info("This is info message.");
		// ??error?????
		logger.error("This is error message.");
	}
}