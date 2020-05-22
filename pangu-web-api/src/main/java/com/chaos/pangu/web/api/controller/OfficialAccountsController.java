package com.chaos.pangu.web.api.controller;

import com.chaos.pangu.web.biz.service.IOfficialAccountsRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/officialAccounts")
public class OfficialAccountsController {

    @Autowired
    private IOfficialAccountsRecordService officialAccountsRecordService;

    @RequestMapping("/delete")
    public String delete(Long id) {
        boolean delete = officialAccountsRecordService.delete(id);
        if (!delete) {
            return "删除失败";
        } else {
            return "删除成功";
        }
    }
}
