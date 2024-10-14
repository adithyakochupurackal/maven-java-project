package com.ust.securityh2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.securityh2.service.MyUser;

//@Repository
public interface UserRepository  extends JpaRepository<MyUser, Long>{

	Optional<MyUser> findByUsername(String username);

}
