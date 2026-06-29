package UtilsPack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerUtils {

        public static Logger getLogger(Class<?> clazz){
            return (Logger) LogManager.getLogger(clazz);
        }

}
