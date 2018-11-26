/**
 * @author daoxuan
 * @date 2018/11/26 17:20
 */
package cn.dubby.logback.study.step1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicUsage {

    private static final Logger logger = LoggerFactory.getLogger(BasicUsage.class);

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            logger.info("log message, timestamp {}", System.currentTimeMillis());
            Thread.sleep(200);
        }
    }

}
