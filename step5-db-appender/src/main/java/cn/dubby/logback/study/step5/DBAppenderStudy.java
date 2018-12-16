/**
 * @author daoxuan
 * @date 2018/11/27 10:10
 */
package cn.dubby.logback.study.step5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

/**
 * SQL脚本请参考
 * logback-classic/src/main/java/ch/qos/logback/classic/db/script
 */
public class DBAppenderStudy {

    private static final Logger logger = LoggerFactory.getLogger(DBAppenderStudy.class);

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            logger.info("log info timestamp {}, userId {}, message {}", System.currentTimeMillis(), ThreadLocalRandom.current().nextInt(10000), "Hello");
            logger.error("log error", new RuntimeException("test exception"));
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000) + 1000);
        }
    }

}
