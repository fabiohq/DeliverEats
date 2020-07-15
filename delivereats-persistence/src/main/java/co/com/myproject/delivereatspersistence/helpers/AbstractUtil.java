package co.com.myproject.delivereatspersistence.helpers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AbstractUtil {

	@Autowired protected Util util;
}
