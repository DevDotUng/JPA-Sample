package com.dangdiary.api.dao;

import java.util.List;

import com.dangdiary.api.domain.customerCenter.dto.InquiryDTO;
import com.dangdiary.api.domain.customerCenter.dto.InquiryHistoryDTO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CustomerCenterDAO {
    void inquiry(InquiryDTO inquiryDTO);
    List<InquiryHistoryDTO> getInquiryHistoryDTOList(int userId);
}
