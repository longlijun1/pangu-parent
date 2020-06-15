package com.chaos.pangu.web.biz.response;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;

/**
 * 响应体。
 *
 * @author longlijun
 */
@Data
public class SimpleResponse {

    private String traceId;

    private String status;

    private String msg;

    private Map<String, Object> data = new HashMap<>();

    public void add(String key, Object value) {
        this.keepDataNotNull();
        data.put(key, value);
    }

    public void keepDataNotNull() {
        if (data == null) {
            data = new LinkedHashMap<>();
        }
    }
}
