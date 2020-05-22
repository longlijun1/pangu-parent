package com.chaos.pangu.web.biz.model.params;

import java.util.Date;
import lombok.Data;

/**
 * 公众号列表查询参数.
 * 
 * @Auther: lijiaosheng
 * @Date: 2019/10/16 10:59
 */
@Data
public class OfficialAccountsParams {

    /**
     * 合同开始时间.
     */
    private Date contractStartDate;

    /**
     * 合同结束时间.
     */
    private Date contractEndDate;

    /**
     * 科目标识.
     */
    private Integer subjectId;


    /**
     * 公众号名称.
     */
    private String name;


    /**
     * 渠道名称.
     */
    private String channelName;

    /**
     * 创建人名称.
     */
    private String creatorName;

    /**
     * 创建开始时间.
     */
    private Date createStartDate;

    /**
     * 创建结束时间.
     */
    private Date createEndDate;

    /**
     * 创建人部门链.
     */
    private String creatorDeptIdChain;
}
