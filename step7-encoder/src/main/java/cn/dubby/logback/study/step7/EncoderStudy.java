/**
 * @author daoxuan
 * @date 2018/12/2 11:18
 */
package cn.dubby.logback.study.step7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncoderStudy {

    private static final Logger logger = LoggerFactory.getLogger(EncoderStudy.class);

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            logger.info("log info {}", i);
        }

    }
}
