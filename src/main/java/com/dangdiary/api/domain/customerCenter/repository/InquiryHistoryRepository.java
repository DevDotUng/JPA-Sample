package com.dangdiary.api.domain.customerCenter.repository;

import com.dangdiary.api.domain.customerCenter.entity.Inquiries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InquiryHistoryRepository extends JpaRepository<Inquiries, Integer> {

    List<Inquiries> findByUserIdOrderByRegisterDate(int userId);

}
