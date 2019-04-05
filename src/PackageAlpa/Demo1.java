package PackageAlpa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	
	private static Logger log= LogManager.getLogger(Demo1.class.getName());
	
	public static void main(String[] args) {


		log.debug("I m debugging...");
		log.info("Info is present");
		log.debug("value is lesser");
		log.error("Error message test...");
		}

}
