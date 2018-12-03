/**
 * @author daoxuan
 * @date 2018/12/2 11:26
 */
package cn.dubby.logback.study.step8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LayoutStudy {

    private static final Logger logger = LoggerFactory.getLogger(LayoutStudy.class);

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            logger.info("log info {}", i);
        }

    }

}
