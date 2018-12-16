/**
 * @author daoxuan
 * @date 2018/11/26 20:24
 */
package cn.dubby.logback.study.step3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RollingFileAppenderStudy {

    private static final Logger logger = LoggerFactory.getLogger(RollingFileAppenderStudy.class);

    public static void main(String[] args) {
        logger.info("log message, timestamp {}", System.currentTimeMillis());
    }

}
