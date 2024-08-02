package com.myapp.apptecheck_be.repository;

import com.myapp.apptecheck_be.entity.QnAAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnAAnswerRepository extends JpaRepository<QnAAnswer, Long> {
}
