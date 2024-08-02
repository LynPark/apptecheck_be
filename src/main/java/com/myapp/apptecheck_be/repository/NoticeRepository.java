package com.myapp.apptecheck_be.repository;

import com.myapp.apptecheck_be.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}
