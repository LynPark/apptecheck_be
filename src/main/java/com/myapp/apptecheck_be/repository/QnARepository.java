package com.myapp.apptecheck_be.repository;

import com.myapp.apptecheck_be.entity.QnA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QnARepository extends JpaRepository<QnA, Long> {
}
