package com.chaos.pangu.web.biz.service.impl;

import com.chaos.pangu.web.biz.dao.OfficialMapper;
import com.chaos.pangu.web.biz.service.IOfficialAccountsRecordService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OfficialAccountsRecordService implements IOfficialAccountsRecordService {

    @Resource
    private OfficialMapper officialMapper;

    @Override
    public boolean delete(Long id) {
        int delete;
        try {
            delete = officialMapper.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return delete > 0 ? true : false;
    }
}
