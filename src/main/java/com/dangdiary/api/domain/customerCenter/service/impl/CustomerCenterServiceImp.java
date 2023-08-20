package com.dangdiary.api.domain.customerCenter.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.dangdiary.api.domain.customerCenter.dto.*;
import com.dangdiary.api.domain.customerCenter.entity.Inquiries;
import com.dangdiary.api.domain.customerCenter.repository.InquiryHistoryRepository;
import com.dangdiary.api.domain.customerCenter.service.CustomerCenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangdiary.api.dao.CustomerCenterDAO;

@Service
@RequiredArgsConstructor
public class CustomerCenterServiceImp implements CustomerCenterService {

    private final InquiryHistoryRepository inquiryHistoryRepository;

    @Override
    public void inquiry(Inquiries inquiries) {
        inquiries.setRegisterDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        inquiryHistoryRepository.save(inquiries);
    }

    @Override
    public List<Inquiries> getInquiryHistoryList(int userId) {

        List<Inquiries> inquiryHistoryList = inquiryHistoryRepository.findByUserIdOrderByRegisterDate(userId);

        return inquiryHistoryList;
    }

}
