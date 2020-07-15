package co.com.myproject.delivereatspersistence.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Util {

	private static StringBuilder SB = new StringBuilder();
	
	public Logger getLoggger(String nombreClase) {
		return LoggerFactory.getLogger(nombreClase);
	}
	public void pintarLog(Logger log,String msg) {
		log.info(msg);
	}
	public StringBuilder getStringBuilder() {				
		return SB;
	}
}
