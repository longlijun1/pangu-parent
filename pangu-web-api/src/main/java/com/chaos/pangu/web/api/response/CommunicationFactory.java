package com.chaos.pangu.web.api.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class CommunicationFactory {

    protected static final Logger logger = LoggerFactory.getLogger(CommunicationResponse.class);

    public static SimpleResponse create() throws Exception {
        SimpleResponse simpleResponse = createCommunicationResponse(SimpleResponse.class);
        return simpleResponse;
    }

    public static  <t extends CommunicationResponse> t createCommunicationResponse(Class<t> clazz) throws Exception {
            t resp = clazz.newInstance();
            String traceId = MDC.get("traceId");
            if (traceId == null) {
                logger.error("createCommunicationResponse getTraceId is null.");
            }
            if (logger.isDebugEnabled()) {
                logger.debug(String.format("createCommunicationResponse(),traceId:%s", traceId));
            }
            resp.setTraceId(traceId == null ? "" : traceId);
            resp.setStatus("0");
            resp.setMsg("success");
            return resp;
    }

}
