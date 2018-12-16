/**
 * @author daoxuan
 * @date 2018/11/26 20:51
 */
package cn.dubby.logback.study.step4.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class SocketAppenderClientStudy {

    private static final Logger logger = LoggerFactory.getLogger(SocketAppenderClientStudy.class);

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (true) {
                logger.info("test {}", System.currentTimeMillis());
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(10) * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (true) {
            logger.info("test {}", System.currentTimeMillis());
            Thread.sleep(ThreadLocalRandom.current().nextInt(10) * 100);
        }
    }

}
