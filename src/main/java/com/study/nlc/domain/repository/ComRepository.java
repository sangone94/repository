package com.study.nlc.domain.repository;

import com.study.nlc.domain.entity.ComEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComRepository extends JpaRepository<ComEntity, String> {
}
