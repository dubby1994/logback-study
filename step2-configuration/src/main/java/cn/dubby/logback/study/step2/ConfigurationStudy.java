/**
 * @author daoxuan
 * @date 2018/11/26 19:44
 */
package cn.dubby.logback.study.step2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigurationStudy {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationStudy.class);

    private static final Logger dubbyAdditivityLogger = LoggerFactory.getLogger("dubby.additivity.logger");

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            logger.info("logger msg {}", System.currentTimeMillis());
            dubbyAdditivityLogger.info("logger msg {}", System.currentTimeMillis());

            Thread.sleep(100);
        }
    }

}
