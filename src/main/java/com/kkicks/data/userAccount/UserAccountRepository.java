package com.kkicks.data.userAccount;

import java.util.UUID;

import com.kkicks.data.core.domain.UserAccount;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount,String> {
    
}
