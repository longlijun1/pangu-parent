package com.chaos.pangu.web.biz.response;

import org.slf4j.MDC;

/**
 * 创建响应体工厂类。
 *
 * @author pangu
 */
public  class CreatResponseFactory {

    public static SimpleResponse creatSimpleResponse() {
            SimpleResponse simpleResponse = new SimpleResponse();
            String traceId = MDC.get("traceId");
            simpleResponse.setTraceId(traceId == null ? "" : traceId);
            simpleResponse.setMsg("success");
            simpleResponse.setStatus("0");
            return simpleResponse;
    }
}
