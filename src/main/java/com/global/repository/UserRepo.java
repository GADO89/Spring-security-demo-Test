


package com.global.repository;

import com.global.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {


    Optional<AppUser> findByUserName(String userName);
}
