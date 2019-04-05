package PackagBeta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	
	private static Logger log= LogManager.getLogger(Demo.class.getName());
	
	public static void main(String[] args) {


		log.debug("clicked button");
		log.info("user clicked on button ");
		log.debug("home page is displayed");
		log.error("invalid user name");
		}

}
