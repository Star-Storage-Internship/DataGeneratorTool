package ro.starstorage.datagenratortool.random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	
	private static final Logger LOG = LogManager.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
		LOG.debug(RandomTokens.generateRandomName());
		LOG.debug(RandomTokens.generateRandomCNP());
		LOG.debug(RandomTokens.generateRandomBool());
		}

	}

}
