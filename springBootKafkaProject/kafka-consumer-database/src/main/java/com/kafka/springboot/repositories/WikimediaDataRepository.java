package com.kafka.springboot.repositories;

import com.kafka.springboot.entities.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {
}
