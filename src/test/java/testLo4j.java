
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by ZHANGJA4 on 8/17/2015.
 */
public class testLo4j {
    public static Logger logger = Logger.getLogger(testLo4j.class);
    @Test
    public  void test() throws IllegalAccessException, InstantiationException {
        // ??debug?????
        logger.debug("This is debug message.");
        // ??info?????
        logger.info("This is info message.");
        // ??error?????
        logger.error("This is error message.");
    }
}
