package com.embarkx.jobms.repository;

import com.embarkx.jobms.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}
