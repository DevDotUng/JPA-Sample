package com.dangdiary.api.domain.customerCenter.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Inquiries {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inquiryId;
    private int userId;
    private String registerDate;
    private String type;
    private String title;
    private String content;
    @Builder.Default
    private String progress = "접수 완료";
    private String answer;
    private String answerDate;
    private Boolean isLike;
}
