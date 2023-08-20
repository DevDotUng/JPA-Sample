package com.dangdiary.api.domain.customerCenter.service;

import com.dangdiary.api.domain.customerCenter.entity.Inquiries;

import java.util.List;

public interface CustomerCenterService {
    void inquiry(Inquiries inquiries);
    List<Inquiries> getInquiryHistoryList(int userId);
}
