package com.chaos.pangu.web.api.response;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommunicationResponse {

    /**日志输出实例. **/
    protected static final Logger logger = LoggerFactory.getLogger(CommunicationResponse.class);

    protected Map<String, Object> data = new HashMap<>();

    protected String traceId;

    protected String status;

    protected String msg;

    public void quickSet(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public void quickSet(String msg) {
        this.msg = msg;
    }

    public static Logger getLogger() {
        return logger;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void addData(String key, Object obj) {
        checkNotNull();
        data.put(key, obj);
    }

    public void checkNotNull() {
        if (data == null) {
            data =  new LinkedHashMap<String, Object>();
        }
    }

}
