package com.dangdiary.api.domain.customerCenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class InquiryDTO {
    private int userId;
    private String type;
    private String title;
    private String content;
}
