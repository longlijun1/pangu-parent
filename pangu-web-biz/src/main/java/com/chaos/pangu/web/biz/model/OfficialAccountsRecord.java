package com.chaos.pangu.web.biz.model;

import java.util.Date;
import lombok.Data;

@Data
public class OfficialAccountsRecord {
    /**
     * 数据标识.
     */
    private Long id;

    /**
     * 公众号名称.
     */
    private String name;

    /**
     * 科目标识.
     */
    private Integer subjectId;

    /**
     * 科目名称.
     */
    private String subjectName;

    /**
     * 渠道名称.
     */
    private String channelName;

    /**
     * 合同时间.
     */
    private Date contractDate;

    /**
     * 打款时间.
     */
    private Date payDate;

    /**
     * 联系方式.
     */
    private String contacts;

    /**
     * 价格.
     */
    private Double price;

    /**
     * 投放时间.
     */
    private Date puttingDate;

    /**
     * 微信号.
     */
    private String wx;

    /**
     * 流量数.
     */
    private Integer noCustomer;

    /**
     * 报名数.
     */
    private Integer noApply;

    /**
     * 链接地址.
     */
    private String linkUrl;

    /**
     * 创建人标识.
     */
    private Long creatorId;

    /**
     * 创建人部门标识.
     */
    private Long creatorDeptId;

    /**
     * 创建人部门链标识.
     */
    private String creatorDeptIdChain;

    /**
     * 创建人名称.
     */
    private String creatorName;

    /**
     * 创建时间.
     */
    private Date createTime;

    /**
     * 修改人标识.
     */
    private Long modifierId;

    /**
     * 修改时间.
     */
    private Date modifyTime;

    /**
     * 是否删除：0、正常|Id值、已删除.
     */
    private Long isDelete;
}
