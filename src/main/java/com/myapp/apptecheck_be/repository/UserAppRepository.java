package com.myapp.apptecheck_be.repository;

import com.myapp.apptecheck_be.entity.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAppRepository extends JpaRepository<UserApp, Long> {
}
