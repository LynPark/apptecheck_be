package com.myapp.apptecheck_be.repository;

import com.myapp.apptecheck_be.entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}