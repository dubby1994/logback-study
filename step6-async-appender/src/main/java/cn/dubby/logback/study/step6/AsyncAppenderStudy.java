/**
 * @author daoxuan
 * @date 2018/11/27 13:53
 */
package cn.dubby.logback.study.step6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncAppenderStudy {

    private static final Logger logger = LoggerFactory.getLogger(AsyncAppenderStudy.class);

    public static void main(String[] args) {
        logger.info("log info");
    }

}
