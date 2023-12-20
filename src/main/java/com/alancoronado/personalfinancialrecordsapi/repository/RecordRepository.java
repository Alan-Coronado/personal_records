package com.alancoronado.personalfinancialrecordsapi.repository;

import com.alancoronado.personalfinancialrecordsapi.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
