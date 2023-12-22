package com.alancoronado.personalfinancialrecordsapi.repository;

import com.alancoronado.personalfinancialrecordsapi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
