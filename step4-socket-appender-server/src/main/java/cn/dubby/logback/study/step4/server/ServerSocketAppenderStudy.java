/**
 * @author daoxuan
 * @date 2018/11/26 20:31
 */
package cn.dubby.logback.study.step4.server;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.SimpleSocketServer;
import ch.qos.logback.core.joran.spi.JoranException;
import org.slf4j.LoggerFactory;

public class ServerSocketAppenderStudy {

    public static void main(String[] args) throws JoranException {
        SimpleSocketServer.configureLC((LoggerContext) LoggerFactory.getILoggerFactory(), "D:\\JavaRepo\\logback-study\\step4-socket-appender-server\\src\\main\\resources\\logback.xml");
        new MySimpleSocketServer(9000).start();
    }

    static class MySimpleSocketServer extends SimpleSocketServer {

        public MySimpleSocketServer(int port) {
            super((LoggerContext) LoggerFactory.getILoggerFactory(), port);
        }
    }

}
