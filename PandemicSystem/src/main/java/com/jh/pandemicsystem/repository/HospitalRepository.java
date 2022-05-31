package com.jh.pandemicsystem.repository;

import com.jh.pandemicsystem.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}

