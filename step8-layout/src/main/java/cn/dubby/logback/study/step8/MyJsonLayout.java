/**
 * @author daoxuan
 * @date 2018/12/2 11:27
 */
package cn.dubby.logback.study.step8;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class MyJsonLayout extends LayoutBase<ILoggingEvent> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public String doLayout(ILoggingEvent event) {
        Map<String, Object> map = new HashMap<>();
        map.put("timestamp", event.getLoggerContextVO().getBirthTime());
        map.put("level", event.getLevel().levelStr);
        map.put("threadName", event.getThreadName());
        map.put("loggerName", event.getLoggerName());
        map.put("message", event.getFormattedMessage());
        map.put("mdc", event.getMDCPropertyMap())

        try {
            return objectMapper.writeValueAsString(map) + CoreConstants.LINE_SEPARATOR;
        } catch (JsonProcessingException e) {
            return "MyJsonLayout format error";
        }
    }
}
