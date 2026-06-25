package UtilsPack;

import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

public class LoggerUtils {

        public static Logger getLogger(Class<?> clazz){
            return (Logger) LogManager.getLogger(clazz);
        }

}
