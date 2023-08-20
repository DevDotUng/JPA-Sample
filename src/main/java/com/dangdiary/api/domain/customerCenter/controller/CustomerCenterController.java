package com.dangdiary.api.domain.customerCenter.controller;

import com.dangdiary.api.domain.customerCenter.entity.Inquiries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dangdiary.api.domain.customerCenter.service.CustomerCenterService;

import java.util.List;

@RestController
@RequestMapping("/api/customerCenter")
public class CustomerCenterController {

    @Autowired
    CustomerCenterService customerCenterService;

    @PostMapping(value = "/inquiry", produces = "application/json;charset=UTF-8")
    public void inquiry(Inquiries inquiries) {
        customerCenterService.inquiry(inquiries);
    }

    @GetMapping(value = "/inquiry/history", produces = "application/json;charset=UTF-8")
    public ResponseEntity<List<Inquiries>> inquiryHistory(int userId) {

        List<Inquiries> inquiryHistoryDTOList = customerCenterService.getInquiryHistoryList(userId);

        return ResponseEntity.status(HttpStatus.OK).body(inquiryHistoryDTOList);
    }
}
