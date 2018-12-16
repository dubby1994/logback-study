/**
 * @author daoxuan
 * @date 2018/11/26 20:17
 */
package cn.dubby.logback.study.step2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShutdownHookConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationStudy.class);

    public static void main(String[] args) {
        logger.info("shutdown hook");
    }

}
